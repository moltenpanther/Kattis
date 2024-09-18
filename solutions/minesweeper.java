import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minesweeper {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        int mines = Integer.parseInt(line[2]);
        
        char[][] grid = new char[rows][cols];
        
        for(int i = 0; i < mines; i++) {
        	
        	line = br.readLine().split(" ");
            int row = Integer.parseInt(line[0]);
            int col = Integer.parseInt(line[1]);
            
            grid[row - 1][col - 1] = '*';
        }
        
        // Output
        for(int i = 0; i < rows; i++) {
        	for(int j = 0; j < cols; j++) {
        		
        		if(grid[i][j] == '*') {
        			sb.append('*');
        		}else {
        			sb.append('.');
        		}
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
        
    	br.close();
    }

}
