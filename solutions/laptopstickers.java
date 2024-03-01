import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class laptopstickers {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[1]);
        int cols = Integer.parseInt(line[0]);
        int num = Integer.parseInt(line[2]);
        
        char[][] grid = new char[rows][cols];
        
        char letter = 'a';
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            int row = Integer.parseInt(line[1]);
            int col = Integer.parseInt(line[0]);
            int rowS = Integer.parseInt(line[3]);
            int colS = Integer.parseInt(line[2]);
            
            for(int r = rowS; r < rowS + row && r < rows; r++) {
                for(int c = colS; c < colS + col && c < cols; c++) {
                    grid[r][c] = letter;
                }
            }
            letter++;
        }
        
        // Output
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 0) {
                    System.out.print('_');
                }else {
                    System.out.print(grid[i][j]);
                }
            }
            System.out.println();
        }
        
        br.close();
    }

}
