import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			int row = scan.nextInt();
			int col = scan.nextInt();
			
			String[][] grid = new String[row][col];
			
			for(int j = 0; j < row; j++) {
				
				String line = scan.next();
				
				for(int k = 0; k < line.length(); k++) {
					
					grid[j][k] = String.valueOf(line.charAt(k));					
				}	
			}
			
			System.out.println("Test " + (i + 1));
			
			for(int j = row - 1; j >= 0; j--) {
				
				for(int k = col - 1; k >= 0; k--) {
					
					System.out.print(grid[j][k]);
				}
				System.out.println();
			}
		}
		scan.close();
	}

}