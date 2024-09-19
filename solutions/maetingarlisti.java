import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maetingarlisti {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[1]);
        int cols = Integer.parseInt(line[2]);
        
        // Filling the desks
        String[][] desks = new String[rows][cols];
        for(int i = 0; i < rows; i++) {
        	
        	String[] row = br.readLine().split(" ");
        	for(int j = 0; j < cols; j++) {
        		desks[i][j] = row[j];
        	}
        }
        
        // Checking the direction
        for(int i = 0; i < rows; i++) {
        	
        	for(int j = 0; j < cols; j++) {

        		String name = br.readLine();
        		if(j == 0) {
        			if(name.equals(desks[i][j])) {
        				sb.append("left");
        			}else {
        				sb.append("right");
        			}
        			sb.append("\n");
        		}
        	}
        }
        
        // Output
    	System.out.println(sb);
   		
    	br.close();
    }

}
