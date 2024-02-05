import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class deathstar {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        
        // Filling the grid
        int[][] grid = new int[num][num];
        for(int i = 0; i < num; i++) {
            line = br.readLine().split(" ");
            for(int j = 0; j < num; j++) {
                grid[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        // Calculating
        for(int i = 0; i < num; i++) {
            int calc = 0;
            for(int j = 0; j < num; j++) {
                calc |= grid[i][j];
            }

            // Output
            System.out.print(calc + " ");
        }       
        
        
        br.close();
    }

}
