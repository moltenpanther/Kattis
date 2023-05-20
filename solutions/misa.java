import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int row = scan.nextInt();
        int col = scan.nextInt();
        
        char[][] grid = new char[row][col];
        
        for(int i = 0; i < row; i++) {
        	String line = scan.next();
        	for(int j = 0; j < col; j++) {
        		grid[i][j] = line.charAt(j);
        	}
        }
        
        int shakes = 0;
        int maxEmpty = 0;
        for(int i = 0; i < row; i++) {
        	
        	for(int j = 0; j < col; j++) {
        		
        		char ch = grid[i][j];
        		
        		if(ch == 'o') {
        			
        			// Check all 8 Directions
        			// UP
        			if(i > 0) {
        				if(grid[i - 1][j] == 'o') {
        					shakes++;
        				}
        				// UL
        				if(j > 0) {
        					if(grid[i - 1][j - 1] == 'o') {
            					shakes++;
            				}
        				}
        				// UR
        				if(j < col - 1) {
        					if(grid[i - 1][j + 1] == 'o') {
            					shakes++;
            				}
        				}
        				
        			}
        			// LEFT
        			if(j > 0) {
        				if(grid[i][j - 1] == 'o') {
        					shakes++;
        				}
        			}
        			
        		}else {
        			
        			int empty = 0;
        			
        			// Check all 8 Directions
        			// UP
        			if(i > 0) {
        				if(grid[i - 1][j] == 'o') {
        					empty++;
        				}
        				// UL
        				if(j > 0) {
        					if(grid[i - 1][j - 1] == 'o') {
            					empty++;
            				}
        				}
        				// UR
        				if(j < col - 1) {
        					if(grid[i - 1][j + 1] == 'o') {
            					empty++;
            				}
        				}
        				
        			}
        			// DOWN
        			if(i < row - 1) {
        				if(grid[i + 1][j] == 'o') {
        					empty++;
        				}
        				// DL
        				if(j > 0) {
        					if(grid[i + 1][j - 1] == 'o') {
            					empty++;
            				}
        				}
        				//DR
        				if(j < col - 1) {
        					if(grid[i + 1][j + 1] == 'o') {
            					empty++;
            				}
        				}
        			}
        			// LEFT
        			if(j > 0) {
        				if(grid[i][j - 1] == 'o') {
        					empty++;
        				}
        			}
        			// RIGHT
        			if(j < col - 1) {
        				if(grid[i][j + 1] == 'o') {
        					empty++;
        				}
        			}
        			
        			
        			if(empty > maxEmpty) {
        				maxEmpty = empty;
        			}
        			
        		}
        		
        	}
        	
        }
        
        System.out.println(shakes + maxEmpty);
        
        
        
        scan.close();
        
	}

}
