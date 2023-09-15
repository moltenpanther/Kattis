import java.util.Scanner;

public class starbattles1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[][] grid = new int[10][10];
        for(int i = 0; i < 10; i++) {
            String row = scan.next();
            for(int j = 0; j < 10; j++) {
                grid[i][j] = Integer.parseInt(row.charAt(j) + "");
            }
        }
        
        char[][] stars = new char[10][10];
        
        int[] check = new int[10];
        int[] rows = new int[10];
        int[] cols = new int[10];

        // Checking stars
        for(int i = 0; i < 10; i++) {
            
            String row = scan.next();
            for(int j = 0; j < 10; j++) {
                
                stars[i][j] = row.charAt(j);
                if(row.charAt(j) == '*') {

                    int area = grid[i][j];
                    check[area]++;
                    
                    rows[i]++;
                    cols[j]++;
                }
            }
        }
        
        // Check for two in each block
        boolean good = true;
        for(int i = 0; i < 10; i++) {
            if(check[i] != 2 || rows[i] != 2 || cols[i] != 2) {
                good = false;
                break;
            }
        }
        
        // Check for no adjacency
        for(int i = 0; i < 10; i++) {
            
            for(int j = 0; j < 10; j++) {
                
                if(stars[i][j] == '*') {
                    
                    // Up
                    if(i - 1 >= 0) {
                        if(stars[i - 1][j] == '*') {
                            good = false;
                            break;
                        }
                        
                        // Up Left
                        if(j - 1 >= 0) {
                            if(stars[i - 1][j - 1] == '*') {
                                good = false;
                                break;
                            }
                        }
                        
                        // Up Right
                        if(j + 1 <= 9) {
                            if(stars[i - 1][j + 1] == '*') {
                                good = false;
                                break;
                            }
                        }
                    }
                    
                    // Down
                    if(i + 1 <= 9) {
                        if(stars[i + 1][j] == '*') {
                            good = false;
                            break;
                        }
                        
                        // Down Left
                        if(j - 1 >= 0) {
                            if(stars[i + 1][j - 1] == '*') {
                                good = false;
                                break;
                            }
                        }
                        
                        // Down Right
                        if(j + 1 <= 9) {
                            if(stars[i + 1][j + 1] == '*') {
                                good = false;
                                break;
                            }
                        }
                    }
                    
                    // Left
                    if(j - 1 >= 0) {
                        if(stars[i][j - 1] == '*') {
                            good = false;
                            break;
                        }
                    }
                    
                    // Right
                    if(j + 1 <= 9) {
                        if(stars[i][j + 1] == '*') {
                            good = false;
                            break;
                        }
                    }
                }
            }
        }
        
        // Output
        if(good) {
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }

        scan.close();
    }
       
}

