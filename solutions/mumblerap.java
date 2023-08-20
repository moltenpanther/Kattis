import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mumblerap {

    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.valueOf(br.readLine());
    	char[] rap = br.readLine().toCharArray();
    	
    	int max = Integer.MIN_VALUE;
		String number = "";
    	for(int i = 0; i < rap.length; i++) {
    		
    		char digit = rap[i];
    		if(digit > 47 && digit < 58) {
    			number += digit;    			
    		}else {
    			
    			if(number.length() > 0) {    			
	    			if(Integer.valueOf(number) > max) {
	    				max = Integer.valueOf(number);
	    			}
	    			number = "";
    			}
    		}
    		
    	}
    	
		if(number.length() > 0) {    			
			if(Integer.valueOf(number) > max) {
				max = Integer.valueOf(number);
			}
		}
    	
    	System.out.println(max);
    	
    	br.close();
    	
    }

}
