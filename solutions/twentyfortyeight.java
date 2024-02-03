import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twentyfortyeight {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] grid = new int[4][4];
        boolean[][] merge = new boolean[4][4];
        
        for(int i = 0; i < 4; i++) {
            
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < 4; j++) {
                int num = Integer.parseInt(line[j]);
                grid[i][j] = num;
            }
            
        }
        
        // 0 1 2 3
        // L U R D
        int dir = Integer.parseInt(br.readLine());
        
        // Left
        if(dir == 0) {
            
            // By row
            for(int i = 0; i < 4; i++) {

                // By col
                // Reset every time a move happens
                for(int j = 0; j < 3; j++) {
                    
                    int num = grid[i][j];
                    int next = grid[i][j + 1];
                    
                    if(num == 0 && next != 0) {
                        grid[i][j] = next;
                        grid[i][j + 1] = 0;
                        j = -1;
                    }else if(num != 0 && num != 2048 && num == next) {
                        if(!merge[i][j] && !merge[i][j + 1]) {
                            grid[i][j] = next * 2;
                            grid[i][j + 1] = 0;

                            merge[i][j] = true;
                            j = -1;
                        }
                    }
                }
            }
        // Up
        }else if(dir == 1) {
            
            // By col
            for(int j = 0; j < 4; j++) {
                                
                // By row
                // Reset every time a move happens
                for(int i = 0; i < 3; i++) {
                    
                    int num = grid[i][j];
                    int next = grid[i + 1][j];
                    
                    if(num == 0 && next != 0) {
                        grid[i][j] = next;
                        grid[i + 1][j] = 0;
                        i = -1;
                    }else if(num != 0 && num != 2048 && num == next) {
                        if(!merge[i][j] && !merge[i + 1][j]) {
                            grid[i][j] = next * 2;
                            grid[i + 1][j] = 0;
                            
                            merge[i][j] = true;
                            i = -1;
                        }
                    }
                }
            }
        // Right
        }else if(dir == 2) {
            
            // By row
            for(int i = 0; i < 4; i++) {

                // By col
                // Reset every time a move happens
                for(int j = 3; j > 0; j--) {
                    
                    int num = grid[i][j];
                    int next = grid[i][j - 1];
                    
                    if(num == 0 && next != 0) {
                        grid[i][j] = next;
                        grid[i][j - 1] = 0;
                        j = 4;
                    }else if(num != 0 && num != 2048 && num == next) {
                        if(!merge[i][j] && !merge[i][j - 1]) {
                            grid[i][j] = next * 2;
                            grid[i][j - 1] = 0;
                            
                            merge[i][j] = true;
                            j = 4;
                        }
                    }
                }
            }
        // Down
        }else if(dir == 3) {
            
            // By col
            for(int j = 0; j < 4; j++) {
                                
                // By row
                // Reset every time a move happens
                for(int i = 3; i > 0; i--) {
                    
                    int num = grid[i][j];
                    int next = grid[i - 1][j];
                    
                    if(num == 0 && next != 0) {
                        grid[i][j] = next;
                        grid[i - 1][j] = 0;
                        i = 4;
                    }else if(num != 0 && num != 2048 && num == next) {
                        if(!merge[i][j] && !merge[i - 1][j]) {
                            grid[i][j] = next * 2;
                            grid[i - 1][j] = 0;
                            
                            merge[i][j] = true;
                            i = 4;
                        }
                    }
                }
            }
        }
                
        // Output
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
        
        br.close();
    }

}
