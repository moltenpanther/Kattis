import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hipphipphurra {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String name = br.readLine();
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++) {
        	sb.append("Hipp hipp hurra, ");
        	sb.append(name);
        	sb.append("!\n");
        }
        
        // Output
    	System.out.println(sb);
   		
    	br.close();
    }

}
