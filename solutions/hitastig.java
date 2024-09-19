import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hitastig {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        
        String[] line = br.readLine().split(" ");
        
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i = 0; i < line.length; i++) {
        	
        	long num = Long.parseLong(line[i]);
        	if(num < min) {
        		min = num;
        	}
        	if(num > max) {
        		max = num;
        	}
        }
        
        // Output
    	System.out.println(max + " " + min);
   		
    	br.close();
    }

}
