import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int swat = scan.nextInt() - 2;
		int count = 0;
		int endCount = 0;
		int cornerRow = 0;
		int cornerCol = 0;
		
		String[][] grid = new String[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			
			String input = scan.next();
			for(int j = 0; j < cols; j++) {
				
				grid[i][j] = String.valueOf(input.charAt(j));
			}	
		}
		
		for(int i = 1; i < rows - swat; i++) {
			
			for(int j = 1; j < cols - swat; j++) {
				
				count = 0;
				
				for(int k = i; k < i + swat; k++) {
				
					for(int l = j; l < j + swat; l++) {
						
						if(grid[k][l].equals("*")) {
									
							count++;
						}		
					}	
				}
				if(count > endCount) {
					endCount = count;
					cornerRow = i - 1;
					cornerCol = j - 1;
				}
			}	
		}
		
		System.out.println(endCount);
		
		for(int i = 0; i < rows; i++) {
			
			for(int j = 0; j < cols; j++) {
				
				if((i == cornerRow && j == cornerCol) || (i == cornerRow && j == cornerCol + swat + 1) || (i == cornerRow + swat + 1 && j == cornerCol) || (i == cornerRow + swat + 1 && j == cornerCol + swat + 1)) {
					System.out.print("+");
				}else if((i == cornerRow && j > cornerCol && j <= cornerCol + swat) || i == cornerRow + swat + 1 && j > cornerCol && j <= cornerCol + swat) {
					System.out.print("-");
				}else if((i > cornerRow && i <= cornerRow + swat && j == cornerCol) || (i > cornerRow && i <= cornerRow + swat && j == cornerCol + swat + 1)) {
					System.out.print("|");
				}else {
					System.out.print(grid[i][j]);					
				}
			}
			System.out.println();
		}
		
		
		scan.close();
	}

}