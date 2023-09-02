import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class welcomehard {

    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	String real = "welcome to code jam";
    	
    	for(int i = 0; i < num; i++) {
    		
	    	String check = br.readLine();

    		int[][] grid = new int[real.length() + 1][check.length() + 1];
	    	
	    	// Set top row as 1s
	    	for(int j = 0; j < grid[0].length; j++) {
	    		grid[0][j] = 1;
	    	}
	    	
	    	// Dynamic Programming
	    	int ans = 0;
	    	for(int j = 1; j < grid.length; j++) {
	    		
	    		char realLetter = real.charAt(j - 1);
	    		for(int k = 1; k < grid[0].length; k++) {
	    			
	    			grid[j][k] = grid[j][k - 1];
	    			char checkLetter = check.charAt(k - 1);
	    			
	    			if(realLetter == checkLetter) {
	    				
	    				int newNum = grid[j][k] + grid[j - 1][k];
	    				if(newNum > 9999) {
	    					newNum -= 10000;
	    				}
	    				grid[j][k] = newNum;
	    				
	    				// Retrieving final answer
	    				if(j == grid.length - 1) {
	    					ans = grid[j][k];
	    				}
	    			}
	    		}
	    	}
	    	
	    	// Output
	    	System.out.printf("Case #%d: %04d\n", (i + 1), ans);
	    	
    	}
    	
    	br.close();
    }

}
