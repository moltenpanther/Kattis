import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class endurvinnsla {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    	
    	br.readLine();
    	double percent = Double.parseDouble(br.readLine());
    	int num = Integer.parseInt(br.readLine());    	
    	
    	int nonplastic = 0;
    	for(int i = 0; i < num; i++) {
    		String trash = br.readLine();
    		if(trash.charAt(0) == 'e') {
    			nonplastic++;
    		}
    	}
    	
    	// Output
    	double contents = nonplastic / (double)num;
    	if(contents > percent) {
    		System.out.println("Neibb");
    	}else {
    		System.out.println("Jebb");
    	}
    	
    	br.close();
    }

}
