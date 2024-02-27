import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class holeynqueensbatman {

    static int count = 0;
    static boolean[][] holes;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int size = Integer.parseInt(line[0]);
        int num = Integer.parseInt(line[1]);
        
        while(size + num != 0) {
            
            count = 0;
            holes = new boolean[size][size];
            
            // Setting up the hole-y spaces
            for(int i = 0; i < num; i++) {
                line = br.readLine().split(" ");
                int row = Integer.parseInt(line[0]);
                int col = Integer.parseInt(line[1]);
                
                holes[row][col] = true;
            }
            
            // Generating boards
            int[] queens = new int[size];
            placeQueens(queens, 0, size);
            
            sb.append(count + "\n");
            
            line = br.readLine().split(" ");
            size = Integer.parseInt(line[0]);
            num = Integer.parseInt(line[1]);
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }
    
    // Recursively places queens
    public static void placeQueens(int[] queens, int row, int size) {
        
        // Returns if the row hits the board size
        if (row == size) {
            count++;
            return;
        }
        
        // Iterates to place queens
        for (int i = 0; i < size; i++) {
            queens[row] = i;
            
            // Checks for valid placement
            boolean good = true;
            for (int j = 0; j < row; j++) {
                
                // Checks for threatening board positions
                if (queens[j] == queens[row] || Math.abs(queens[j] - queens[row]) == Math.abs(j - row)) {
                    good = false;
                    j = row;
                }
                
            }
            
            // Checks for holes
            if(holes[queens[row]][row]) {
                good = false;
            }
            
            // Continues the recursion
            if (good) {
                placeQueens(queens, row + 1, size);
            }
        }
    }
}
