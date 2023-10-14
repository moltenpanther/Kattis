import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class compromise {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
		
    	for(int i = 0; i < num; i++) {
    		
    		String[] line = br.readLine().split(" ");
    		int lines = Integer.parseInt(line[0]);
    		int length = Integer.parseInt(line[1]);
    		
    		// Reading in the binary strings and
    		// Counting the number of ones per column
    		int[] ones = new int[length];
    		
    		for(int j = 0; j < lines; j++) {
    			
    			String bin = br.readLine();    			
    			for(int k = 0; k < length; k++) {
    				if(bin.charAt(k) == '1') {
    					ones[k]++;
    				}
    			}
    		}
    		
    		// Counting max ones
    		StringBuilder sb = new StringBuilder();
    		for(int j = 0; j < length; j++) {
    			if(ones[j] > lines / 2) {
    				sb.append('1');
    			}else {
    				sb.append('0');
    			}
    		}
    		
    		// Output
    		System.out.println(sb);
    		
    	}
    	
   		
    	br.close();
    }

}
