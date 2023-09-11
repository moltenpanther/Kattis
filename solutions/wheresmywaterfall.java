import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wheresmywaterfall {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
        String[] input = br.readLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int num = Integer.parseInt(input[2]);
        
        char[][] grid = new char[rows][cols];
        
        String[] waterfall = br.readLine().split(" ");
        
        // Loading in the map
        for(int i = 0; i < rows; i++) {
            String line = br.readLine();
            for(int j = 0; j < cols; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        
        // Waterfalls
        for(int i = 0; i < num; i++) {
            
            int row = 0;
            int col = Integer.parseInt(waterfall[i]);
                
            grid = waterFall(grid, row, col);
            
        }
            
        // Test Printing
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sb.append(grid[i][j]);
            }
            sb.append("\n");
        }
        
        System.out.print(sb.toString());

        br.close();
    }

    
    private static char[][] waterFall(char[][] grid, int row, int col) {
        
        grid[row][col] = '~';

        // Water Falls
        if(row + 1 < grid.length) {         
            if(grid[row + 1][col] == 'O') {
                row++;
                waterFall(grid, row, col);
            
            // Water Spreads
            }else if(grid[row + 1][col] == '#' || grid[row + 1][col] == '?'){
                
                // Spread Left
                if(col - 1 >= 0) {
                    if(grid[row][col - 1] == 'O') {
                        waterFall(grid, row, col - 1);
                    }
                }
                
                // Spread Right
                if(col + 1 < grid[0].length) {
                    if(grid[row][col + 1] == 'O') {
                        waterFall(grid, row, col + 1);
                    }
                }
            }
        }
        
        return grid;        
    }

}
