import java.util.Scanner;

public class tajna {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	String code = scan.next();
    	int len = code.length();
    	
    	// Finding right matrix size
    	int rows = 0;
    	int cols = 0;
    	for(int i = 1; i <= len; i++) {
    		
    		int rem = len % i;
    		int div = len / i;
    		
    		if(rem == 0 && i <= div && i > rows) {
				rows = i;
				cols = div;
    		}else if(i > div) {
    			i = len + 1;
    		}
    	}
    	
    	// Loading the grid
    	char[][] grid = new char[rows][cols];
    	int counter = 0;

    	for(int j = 0; j < cols; j++) {
    		for(int i = 0; i < rows; i++) {
    			grid[i][j] = code.charAt(counter++);
    		}
    	}
    	
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < cols; j++) {
    			System.out.print(grid[i][j]);
    		}
    	}
    	
    	scan.close();
    	
    }

}
