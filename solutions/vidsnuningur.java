import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vidsnuningur {

    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String input = br.readLine();

	    // Output
    	for(int i = input.length() - 1; i >= 0; i--) {
    		System.out.print(input.charAt(i));
    	}
    	
    	br.close();
    }

}
