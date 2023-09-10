import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fifa {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    	
    	int improvements = Integer.parseInt(br.readLine());    	
    	int perYear = Integer.parseInt(br.readLine());    	
    	
    	int years = improvements / perYear;
    	
    	// Output
  		System.out.println(2022 + years);

    	
    	br.close();
    }

}
