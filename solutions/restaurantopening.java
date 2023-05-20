import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] grid = new int[row][col];
        
        for(int i = 0; i < row; i++) {
        	for(int j = 0; j < col; j++) {
        		int num = scan.nextInt();
        		grid[i][j] = num;
        	}
        }
        
        int bestCost = Integer.MAX_VALUE;
        for(int i = 0; i < row; i++) {
        	
        	for(int j = 0; j < col; j++) {
        		
        		int cost = calcCost(grid, i, j);
        		if(cost < bestCost) {
        			bestCost = cost;
        		}
        	
        	}
        }
        
        System.out.println(bestCost);
        
        scan.close();
    }

	public static int calcCost(int[][] grid, int row, int col) {
		
		int cost = 0;
		for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[0].length; j++) {
        		int dist = Math.abs(row - i) + Math.abs(col - j);
        		int gridCost = dist * grid[i][j];
        		cost += gridCost;
        	}
        }
		
		return cost;
	}    
    
}