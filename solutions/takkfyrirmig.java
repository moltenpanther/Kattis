import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class takkfyrirmig {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++) {
        	sb.append("Takk ");
        	sb.append(br.readLine());
        	sb.append("\n");
        }
        
        // Output
    	System.out.println(sb);
   		
    	br.close();
    }

}
