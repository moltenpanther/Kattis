import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class apples {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        
        int[] blocks = new int[cols];
        int[] apples = new int[cols];
        char[][] grid = new char[rows][cols];
        
        // Setting up arrays
        for(int i = 0; i < cols; i++) {
            blocks[i] = rows;
        }
        
        // Filling initial grid
        for(int i = 0; i < rows; i++) {
            
            String row = br.readLine();
            for(int j = 0; j < row.length(); j++) {
                
                char ch = row.charAt(j);
                
                // Apple
                if(ch == 'a') {
                    apples[j]++;
                    blocks[j] = rows;
                
                // Nothing
                }else if(ch == '.') {
                    grid[i][j] = '.';

                // Block
                }else {
                    
                    grid[i][j] = '#';
                    
                    // Fill apples above
                    if(apples[j] > 0) {
                        
                        int iIndex = i - 1;
                        while(apples[j] > 0 && j >= 0 && grid[iIndex][j] != '#') {
                            grid[iIndex--][j] = 'a';
                            apples[j]--;
                        }
                        blocks[j] = rows;
                    }else {
                        blocks[j] = j;
                    }
                }
            }
        }
        
        // Checking bottom row
        for(int j = 0; j < cols; j++) {
            int iIndex = rows - 1;
            if(blocks[j] == rows) {
                while(apples[j] > 0 && j >= 0 && grid[iIndex][j] != '#') {
                    grid[iIndex--][j] = 'a';
                    apples[j]--;
                }
            }
        }
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 0) {
                    grid[i][j] = '.';
                }
                sb.append(grid[i][j]);
            }
            sb.append("\n");
        }
        // Output
        System.out.print(sb);
        
        br.close();
    }

}
