import java.util.Scanner;

public class knapsack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		// Scan in the input
		while(scan.hasNext()) {
			
			int max = scan.nextInt();
			int num = scan.nextInt();
			
			knapsack loot[] = new knapsack[num];
			
			for(int i = 0; i < num; i++) {
				
				int val = scan.nextInt();
				int wgt = scan.nextInt();

				knapsack item = new knapsack(wgt, val, i);
				loot[i] = item;		
			}
			
			
			// Making the 2D-array and filling it

			int[][] grid = new int[num + 1][max + 1];
			
			for(int i = 1; i < num + 1; i++) {
				
				knapsack item = loot[i - 1];
				
				int itemW = item.weight;
				int itemVal = item.val;
												
				for(int j = 1; j < max + 1; j++) {
					
					int without = grid[i - 1][j];
					int with = 0;
					
					if(j - itemW >= 0) {
						with = itemVal + grid[i - 1][j - itemW];							
					}
					
					grid[i][j] = Math.max(without, with);
				}
			}
					
			int endVal = grid[num][max];	
			
			
		/*	// Test Print
			for(int i = 0; i < num + 1; i++) {
				for(int j = 0; j < max + 1; j++) {
					System.out.print(grid[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("MaxVal: " + endVal + "\n\n");
		*/
			
			// Traversing the grid to find the chosen items
			int count = 0;
			int row = num;
			int col = max;
			knapsack stolen[] = new knapsack[num];
			
			while(endVal > 0) {
				
				knapsack item = loot[row - 1];
				
				int stolenWeight = item.weight;
				int stolenVal = item.val;
							
				if(grid[row][col] != grid[row - 1][col]) {
					stolen[count++] = item;
					col -= stolenWeight;
					endVal -= stolenVal;
				}
				row--;
			}
			
			
			//Output
			System.out.println(count);
			for(int i = 0; i < count; i++) {
				knapsack item = stolen[i];
				System.out.print(item.origIndex + " ");
			}
			System.out.println(); 
			
		}
			
		scan.close();
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	// knapsack Object info
	
	int weight;
	int val;
	int origIndex;
	
	public knapsack(int weight, int val, int origIndex) {
		this.weight = weight;
		this.val = val;
		this.origIndex = origIndex;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getVal() {
		return val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	
	public int getOrigIndex() {
		return origIndex;
	}
	
	public void setOrigIndex(int origIndex) {
		this.origIndex = origIndex;
	}
	
}
