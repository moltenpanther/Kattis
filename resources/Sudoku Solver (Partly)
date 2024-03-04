import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class simplysudoku {
    
    static LinkedList<Integer>[][] grid = new LinkedList[9][9];
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // Filling the grid
        for(int i = 0; i < 9; i++) {
            
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < 9; j++) {
                
                LinkedList<Integer> list = new LinkedList<Integer>();
                int num = Integer.parseInt(line[j]);
                if(num == 0) {
                    for(int k = 1; k <= 9; k++) {
                        list.add(k);
                    }
                }else {
                    list.add(num);
                }
                
                grid[i][j] = list;
            }
        }
        
        // Solving it
        // Getting vectors and checking them in a method
        boolean change = true;
        while(change) {
            
            change = false;
            
            // Rows
            for(int i = 0; i < 9; i++) {
                
                LinkedList<Integer>[] vector = new LinkedList[9];
                int[][] coords = new int[2][9];
                
                // Filling the vector with the cols
                for(int j = 0; j < 9; j++) {
                    vector[j] = grid[i][j];
                    coords[0][j] = i;
                    coords[1][j] = j;
                }
                
                boolean checkVector = checkVector(vector, coords);
                if(checkVector) {
                    change = true;
                }
            }
            
            // Cols
            for(int i = 0; i < 9; i++) {
                
                LinkedList<Integer>[] vector = new LinkedList[9];
                int[][] coords = new int[2][9];
                
                // Filling the vector with the rows
                for(int j = 0; j < 9; j++) {
                    vector[j] = grid[j][i];
                    coords[0][j] = j;
                    coords[1][j] = i;
                }
                
                boolean checkVector = checkVector(vector, coords);
                if(checkVector) {
                    change = true;
                }
            }
            
            // Squares
            int offsetRow = 0;
            int offsetCol = 0;
            for(int i = 0; i < 9; i++) {
                
                // Filling the vector with the squares
                LinkedList<Integer>[] vector = new LinkedList[9];
                int[][] coords = new int[2][9];
                
                // Getting the square
                int j = 0;
                for(int m = 0; m < 3; m++) {
                    for(int n = 0; n < 3; n++) {
                        
                        int row = m + offsetRow;
                        int col = n + offsetCol;
                        
                        vector[j] = grid[row][col];
                        coords[0][j] = row;
                        coords[1][j] = col;
                        
                        j++;
                    }
                }
                
                offsetCol += 3;
                
                if(offsetCol >= 9) {
                    offsetCol = 0;
                    offsetRow += 3;
                }
                
                boolean checkVector = checkVector(vector, coords);
                if(checkVector) {
                    change = true;
                }
            }
        }
        
        // Printing the grid
        boolean easy = true;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                
                if(grid[i][j].size() > 1) {
                    sb.append(". ");
                    easy = false;
                }else {
                    sb.append(grid[i][j].get(0) + " ");
                }
                
            }
            sb.append("\n");
        }
        
        // Output
        if(easy) {
            System.out.println("Easy");
        }else {
            System.out.println("Not easy");
        }
        
        System.out.println(sb);
        
        br.close();
    }
    
    // Checks a vector for repeats
    public static boolean checkVector(LinkedList<Integer>[] vector, int[][] coords) {
        
        boolean change = false;
        boolean[] check = new boolean[10];
        
        // Loop the vector for solo values
        for(int i = 0; i < 9; i++) {
            if(vector[i].size() == 1) {
                int val = vector[i].get(0);
                check[val] = true;
            }
        }
        
        // Loop again to remove the solo values
        for(int i = 0; i < 9; i++) {
            
            // Loop through the list of checks and remove those from this list
            if(vector[i].size() > 1) {
                
                int row = coords[0][i];
                int col = coords[1][i];

                for(int j = 1; j < 10; j++) {
                    
                    if(check[j]) {
                        
                        if(grid[row][col].contains(j)) {
                            
                            int index = grid[row][col].indexOf(j);
                            grid[row][col].remove(index);
                            
                            change = true;
                        }
                    }
                }
            }
        }
        
        // Looking for forced placements
        int[] count = new int[10];
        
        // Looping the vectors
        for(int i = 0; i < 9; i++) {
            
            int row = coords[0][i];
            int col = coords[1][i];
            
            // Looping the list
            LinkedList<Integer> list = grid[row][col];
            for(int j = 1; j <= 9; j++) {
                if(!list.contains(j)) {
                    count[j]++;
                }
            }
        }
        
        // Checking for forced placements
        for(int i = 1; i <= 9; i++) {
            
            if(count[i] == 8) {
                
                // Find the list with the value and place it
                for(int j = 0; j < 9; j++) {
                    
                    int row = coords[0][j];
                    int col = coords[1][j];
                    
                    // Looping the list
                    if(grid[row][col].contains(i)) {
                        grid[row][col].clear();
                        grid[row][col].add(i);
                    }
                }
            }
        }
        
        return change;
    }

}
