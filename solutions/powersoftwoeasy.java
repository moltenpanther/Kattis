import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class powersoftwoeasy {

    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split(" ");
    	
    	int limit = Integer.parseInt(input[0]);
    	int exp = Integer.parseInt(input[1]);
    	
    	int num = (int)Math.pow(2, exp);
    	String numStr = String.valueOf(num);
    	    	
	    // Output
    	int count = 0;
    	for(int i = num; i <= limit; i++) {
    		
    		String check = String.valueOf(i);
    		if(check.contains(numStr)) {
    			count++;    			
    		}
    		
    	}
    	    	
    	System.out.println(count);
    	
    	br.close();
    }

}
