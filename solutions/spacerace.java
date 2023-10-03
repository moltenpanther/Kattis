import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class spacerace {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	double dis = Double.parseDouble(br.readLine());
    	
    	String winner = "";
    	double max = -1;
    	for(int i = 0; i < num; i++) {
    		
    		String[] racer = br.readLine().split(" ");
    		String name = racer[0];
    		double consumed = Double.parseDouble(racer[2]);
    		
    		double eff = dis / consumed;
    		
    		if(eff > max) {
    			max = eff;
    			winner = name;
    		}
    	}
    	
    	// Output
    	System.out.println(winner);
   		
    	br.close();
    }

}
