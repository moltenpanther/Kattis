import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class parsinghex {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String line = "";
    	while((line = br.readLine()) != null) {
    		
    		line += " ";
    		for(int i = 0; i < line.length() - 1; i++) {
    			
    			if(line.substring(i, i + 2).equalsIgnoreCase("0X")) {
    				
    				int end = line.length() - 1;
    				for(int j = i + 2; j < line.length() - 1 ; j++) {
    					
    					int letter = Integer.valueOf(line.charAt(j));
    					if((letter > 47 && letter < 58) || (letter > 64 && letter < 71) || (letter > 96 && letter < 103)) {
    						
    					}else {
    						end = j;
    						j = line.length();
    					}
    				}
    				
    				String hex = line.substring(i, end);
    				if(hex.length() > 2) {    					
	    				System.out.print(hex + " ");
	    				System.out.println(Long.valueOf(hex.substring(2), 16));
	    				i = end;
    				}
    			}
    		}
    	}

    	br.close();
    }
    
}
