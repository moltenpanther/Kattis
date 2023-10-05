import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class walrusweights {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int[] weights = new int[num + 1];
        
        for(int i = 1; i <= num; i++) {
            int weight = Integer.parseInt(br.readLine());
            weights[i] = weight;
        }
        
        Arrays.sort(weights);
        
        int[][] grid = new int[num + 1][2000];
        int goal = 1000;
        int dif = 1000;
        int closest = 0;
        for(int i = 1; i <= num; i++) {
            
            int weight = weights[i];
            grid[i][weight] = weight;
            
            // Filling the weights
            for(int j = weights[1]; j < goal * 2; j++) {
                
                if(weight <= j) {               
                    int check = j - weight;
                    if(grid[i - 1][check] > 0) {
                        grid[i][j] = weight + grid[i - 1][check];
                    }
                }
                
                if(grid[i][j] == 0 && grid[i - 1][j] > 0) {
                    grid[i][j] = grid[i - 1][j];
                }

                // Checking for closest
                if(grid[i][j] != 0) {
                    
                    int difNow = Math.abs(goal - grid[i][j]);
                    if(difNow <= dif) {
                        dif = difNow;
                        closest = grid[i][j];
                    }
                    
                }
            }
        }

        // Output
        System.out.println(closest);
        
        br.close();
    }

}

