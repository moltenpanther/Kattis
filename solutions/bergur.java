import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bergur {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        String[] line = br.readLine().split(" ");
        
        int prev = Integer.parseInt(line[line.length - 1]);
        int total = prev;
        for(int i = line.length - 2; i >= 0; i--) {
        	
        	int num = Integer.parseInt(line[i]);
        	if(num <= prev) {
        		prev = num;
        	}
        	
        	total += prev;
        }
        
        // Output
    	System.out.println(total);
   		
    	br.close();
    }

}
