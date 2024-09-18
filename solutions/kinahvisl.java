import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kinahvisl {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String start = br.readLine();
        String end = br.readLine();
        
        int count = 1;
        for(int i = 0; i < start.length(); i++) {
        	
        	if(start.charAt(i) != end.charAt(i)) {
        		count++;
        	}
        	
        }
        
        // Output
    	System.out.println(count);
   		
    	br.close();
    }

}
