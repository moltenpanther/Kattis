import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beatspread {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++) {
        	
            String[] line = br.readLine().split(" ");
            int sum = Integer.parseInt(line[0]);
            int dif = Integer.parseInt(line[1]);
            
            boolean possible = false;
            for(int j = 0; j <= sum && !possible; j++) {
            	
            	int low = j;
            	int high = sum - j;
            	
            	int sumMaybe = low + high;
            	int difMaybe = Math.abs(low - high);
            	
            	if(sumMaybe == sum && difMaybe == dif) {
            		possible = true;
            		sb.append(high + " " + low + "\n");
            	}
            	
            }
            
            if(!possible) {
            	sb.append("impossible\n");
            }
        }
        
        // Output
    	System.out.println(sb);
   		
    	br.close();
    }

}
