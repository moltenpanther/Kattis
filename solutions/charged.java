import java.util.Scanner;

public class charged {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.next()) + 1;
        int m = Integer.parseInt(scan.next()) + 1;
        int q = Integer.parseInt(scan.next());
        
        double[][] mags = new double[n][m];
        char[][] grid = new char[n][m];
        
        // Load in all qs?
        int[][] coord = new int[q][2];        
        for(int i = 0; i < q; i++) {
        	
        	int y = Integer.parseInt(scan.next());
        	int x = Integer.parseInt(scan.next());
        	
        	coord[i][0] = x;
        	coord[i][1] = y;
        	
        	char charge = scan.next().charAt(0);
        	if(charge == '-') {
        		grid[x][y] = '-';
        		coord[i][0] *= -1;
        	}else {
        		grid[x][y] = '+';
        	}
        	
        }
        
        // Calculate magnitudes in grid
        for(int i = 1; i < n; i++) {
        	
        	for(int j = 1; j < m; j++) {
        		
        		double mag = 0;
        		
        		// Check if a particle has been placed
        		// Loops through coords
        		if(grid[i][j] == 0) {
        			
	        		for(int k = 0; k < q; k++) {
	        			
	        			int x = coord[k][0];
	        			int y = coord[k][1];
	        			
	        			boolean neg = false;
	        			if(x < 0) {
	        				neg = true;
	        				x *= -1;
	        			}
	        			
	        			double dis = getDistance(x, y, i, j, neg);
	        			mag += dis ;
	        		}
	        		
	        		mags[i][j] = mag;
	        		
	        		char input = '.';
	        		// Pi-Tier check
	        		// Positive
	        		if(mag > 0) {	        			
		        		if(mag > (1 / Math.PI)) {
		        			input = '0';
		        		}else if(mag > (1 / Math.pow(Math.PI, 2))) {
		        			input = 'O';
		        		}else if(mag > (1 / Math.pow(Math.PI, 3))) {
		        			input = 'o';
		        		}
	        		}else {	
	        			mag *= -1;
		        		// Negative
		        		if(mag > (1 / Math.PI)) {
		        			input = '%';
		        		}else if(mag > (1 / Math.pow(Math.PI, 2))) {
		        			input = 'X';
		        		}else if(mag > (1 / Math.pow(Math.PI, 3))) {
		        			input = 'x';
		        		}
	        		}
	        		
	        		grid[i][j] = input;
        		}
        		
        	}
        	
        }
        
        // Print out grid
        for(int j = 1; j < n; j++) {
    		
    		for(int k = 1; k < m; k++) {	
    			System.out.print(grid[j][k]);
    		}
    		System.out.println();
    	}
        
        
        scan.close();
    }

	public static double getDistance(double x1, double y1, double x2, double y2, boolean neg) {
    	
		double dis = 0;
		dis = 1 / Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		if(neg) {
			dis *= -1;
		}
		
		return dis;
	}
}
