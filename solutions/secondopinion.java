import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class secondopinion {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        int hours = num / 3600;
        num -= hours * 3600;
        
        int minutes = num / 60;
        int seconds = num % 60;
        
        // Output
    	System.out.println(hours + " : " + minutes + " : " + seconds);
   		
    	br.close();
    }

}
