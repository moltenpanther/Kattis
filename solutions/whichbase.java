import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class whichbase {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    	
    	int num = Integer.parseInt(br.readLine());
    	for(int i = 0; i < num; i++) {
    		
    		String[] line = br.readLine().split(" ");
    		
    		String dec = line[1];
    		
    		int oct = 0;
    		try {
    			oct = Integer.parseInt(dec, 8);    			
    		}catch(Exception ex){
    			
    		}
    		int hex = Integer.parseInt(dec, 16);
    		
    		System.out.println((i + 1) + " " + oct + " " + Integer.parseInt(dec) + " " + hex);
    		
    	}
    	
    	// Output
    	System.out.println("");
    	
    	br.close();
    }

}
