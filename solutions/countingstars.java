import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class countingstars {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int caseCount = 1;
    	String line = "";
    	while((line = br.readLine()) != null) {
    		
    		String[] inp = line.split(" ");
	    	int rows = Integer.parseInt(inp[0]);
	    	int cols = Integer.parseInt(inp[1]);
	    	
	    	char[][] map = new char[rows][cols];
	    	for(int i = 0; i < rows; i++) {
	    		
	    		line = br.readLine();
	    		
	    		for(int j = 0; j < cols; j++) {
	    			map[i][j] = line.charAt(j);
	    		}
	    	}
	    	
	    	// BFS to count stars
	    	int count = 0;
	    	for(int i = 0; i < rows; i++) {
	    		for(int j = 0; j < cols; j++) {
	    			if(map[i][j] == '-') {
	    				
	    				count++;
	    				
	    				// BFS time!
	    				Queue<String> queue = new LinkedList<String>();
	    				
	    				String coord = i + "," + j;
	    				queue.add(coord);
	    				map[i][j] = '|';
	    				
	    				while(!queue.isEmpty()) {
	    					
	    					String[] coords = queue.remove().split(",");
	    					int x = Integer.parseInt(coords[0]);
	    					int y = Integer.parseInt(coords[1]);
	    					
	    					// Left
	    					if(x - 1 >= 0) {
	    						if(map[x - 1][y] == '-') {
		    						queue.add((x - 1) + "," + y);
		    						map[x - 1][y] = '|';
	    						}
	    					}
	    					// Right
	    					if(x + 1 < rows) {
	    						if(map[x + 1][y] == '-') {
		    						queue.add((x + 1) + "," + y);
		    						map[x + 1][y] = '|';
	    						}
	    					}
	    					// Up
	    					if(y - 1 >= 0) {
	    						if(map[x][y - 1] == '-') {
		    						queue.add(x + "," + (y - 1));
		    						map[x][y - 1] = '|';
	    						}
	    					}
	    					// Down
	    					if(y + 1 < cols) {
	    						if(map[x][y + 1] == '-') {
		    						queue.add(x + "," + (y + 1));
		    						map[x][y + 1] = '|';
	    						}
	    					}
	    				}
	    			}
	    		}
	    	}    	
	    	
	    	// Output
	    	System.out.println("Case " + caseCount + ": " + count);
	    	caseCount++;
    	}
   		
    	br.close();
    }

}
