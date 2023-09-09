import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leggjasaman {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    	
    	int num1 = Integer.parseInt(br.readLine());
    	int num2 = Integer.parseInt(br.readLine());
    	
    	// Output
    	System.out.println(num1 + num2);
   		
    	br.close();
    }

}
