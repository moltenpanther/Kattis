import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputscandal {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = 0;
        String line = "";
        while((line = br.readLine()) != null) {
        	
        	sb.append(line);
        	sb.append("\n");
        	
        	num++;
        }
        
        // Output
        System.out.println(num);
        System.out.println(sb);
   		
    	br.close();
    }

}
