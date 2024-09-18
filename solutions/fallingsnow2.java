import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fallingsnow2 {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        int[] sCount = new int[cols];
        char[][] grid = new char[rows][cols];
        
        for(int i = 0; i < rows; i++) {
        	
        	String row = br.readLine();
        	for(int j = 0; j < cols; j++) {
        		
        		char ch = row.charAt(j);
        		if(ch == 'S') {
        			sCount[j]++;
        		}
        		
        		grid[i][j] = '.';
        	}
        }
        
        // Snow falling
        for(int i = rows - 1; i >= 0; i--) {
        	
        	for(int j = 0; j < cols; j++) {
        		if(sCount[j] > 0) {
        			grid[i][j] = 'S';
        			sCount[j]--;
        		}
        	}
        }
        
        // Output
        for(int i = 0; i < rows; i++) {
        	for(int j = 0; j < cols; j++) {
        		sb.append(grid[i][j]);
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
        
    	br.close();
    }

}
