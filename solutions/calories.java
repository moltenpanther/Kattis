import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calories {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		
    	// Fat, Protein, Sugar, Starch, Alcohol
    	// 9/g,   4/g  ,  4/g ,   4/g ,   7/g   	
    	
    	double fat = 0;
    	double all = 0;
    	
    	String line = br.readLine();
    	
    	boolean go = true;
    	while(go) {
    		    	
    		double[] grams = new double[5];
    		double[] cals = new double[5];
    		double[] perc = new double[5];
    		
    		String[] food = line.split(" ");
    		
    		for(int i = 0; i < 5; i++) {    
    			int num = Integer.parseInt(food[i].substring(0, food[i].length() - 1));
    			char type = food[i].charAt(food[i].length() - 1);
    			
    			if(type == 'g') {
    				grams[i] += num;
    			}else if(type == 'C') {
    				cals[i] += num;
    			}else {
    				perc[i] += num;
    			}
    		}
    		
    		cals[0] += grams[0] * 9;
    		cals[1] += grams[1] * 4;
    		cals[2] += grams[2] * 4;
    		cals[3] += grams[3] * 4;
    		cals[4] += grams[4] * 7;
    		
    		double sumCal = 0;
    		double sumPerc = 0;
    		for(int i = 0; i < 5; i++) {
    			sumCal += cals[i];
    			sumPerc += perc[i];    			
    		}
		
    		double calPerc = 100 - sumPerc;
    		double onePerc = sumCal / calPerc;
    		
    		for(int i = 0; i < 5; i++) {
    			perc[i] *= onePerc;
    			cals[i] += perc[i];
    			all += cals[i];
    		}
    		
    		fat += cals[0];
    		
    		line = br.readLine();
    		
    		if(line.equals("-")) {
    			    		
	    		// Output
	    		int ans = (int)Math.round((fat / all) * 100);
		    	System.out.println(ans + "%");
		    	
		    	line = br.readLine();
		    	
		    	fat = 0;
		    	all = 0;
		    	
	    		if(line.equals("-")) {
	    			go = false;
	    		}
    		}
	   		
    	}
    	
    	br.close();
    }

}
