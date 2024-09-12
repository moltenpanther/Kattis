import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class storafmaeli {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        // Output
        if(num % 10 == 0) {
        	System.out.println("Jebb");
        }else {
        	System.out.println("Neibb");
        }
        
    	br.close();
    }

}
