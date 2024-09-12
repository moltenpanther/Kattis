import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class barcelona {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int benni = Integer.parseInt(line[1]);
        
        line = br.readLine().split(" ");
        for(int i = 0; i < num; i++) {
            
        	int bag = Integer.parseInt(line[i]);
            if(bag == benni) {
            	
            	if(i == 1) {
            		sb.append("naest");
            	}else if (i > 1){
            		sb.append((i + 1) + " ");
            	}
            	
        		sb.append("fyrst");

            	i = num;
            }
            
        }
        
        // Output
    	System.out.println(sb);
   		
    	br.close();
    }

}
