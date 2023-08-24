import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class polymul1 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

    	int cases = Integer.parseInt(br.readLine());
    	for(int i = 0; i < cases; i++) {
    		
    		// Loads the Polynomials
    		int degree1 = Integer.parseInt(br.readLine()) + 1;
    		String[] poly1 = br.readLine().split(" ");   		
    		int degree2 = Integer.parseInt(br.readLine()) + 1;
    		String[] poly2 = br.readLine().split(" ");
    		
    		// Looping through both polynomials
    		int[] calc = new int[degree1 + degree2];
    		int max = Integer.MIN_VALUE;
    		for(int j = 0; j < degree1; j++) {
    			
    			if(Integer.parseInt(poly1[j]) != 0) {
	    			for(int k = 0; k < degree2; k++) {
	    				
	    				if(Integer.parseInt(poly2[k]) != 0) {
	    					
	    					int coeff = Integer.parseInt(poly1[j]) * Integer.parseInt(poly2[k]);
	    					int exp = j + k;
	    					
	    					// Getting New Degree
	    					if(exp > max) {
	    						max = exp;
	    					}
	    					
	    					// Adding like exponents
	    					calc[exp] += coeff;
	    				}
	    			}
    			}
    		}
    		
    		// Output
    		sb.append(max + "\n");
    		for(int j = 0; j <= max; j++) {
    			sb.append(calc[j] + " ");
    		}
    		
    		sb.append("\n");
    		
    	}
    	
    	System.out.print(sb.toString());
    	
    	br.close();
    	
    }

}
