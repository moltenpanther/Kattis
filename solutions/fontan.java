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
        
	    
	    // Print Grid
	    for(int i = 0; i < row - 1; i++) {
	    	
	    	for(int j = 0; j < col; j++) {
	    		
	    		char ch = grid[i][j];
	    		
	    		if(ch == 'V') {
	    			if(grid[i + 1][j] == '.') {
	    				grid[i + 1][j] = 'V';
	    			}else if(grid[i + 1][j] == '#') {
	    				
	    				if(j > 0) {
	    					if(grid[i][j - 1] == '.') {	    						
		    					grid[i][j - 1] = 'V';
		    					j--;
		    					j--;
	    					}
	    				}
	    				if(j < col - 1) {
	    					if(grid[i][j + 1] == '.') {
	    						grid[i][j + 1] = 'V';	    						
	    					}
	    				}
	    			}
	    			
	    		}
	    		
	    		
	    	}
	    	
	    	
	    }
	    
	    
	    // Print Grid
	    for(int i = 0; i < row; i++) {
	    	for(int j = 0; j < col; j++) {
	    		System.out.print(grid[i][j]);
	    	}
	    	System.out.println();
	    }
        
	    
        scan.close();
        
	}

}
