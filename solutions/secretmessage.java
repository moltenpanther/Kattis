import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			String input = scan.next();
			int length = input.length();
			int sqrt = 0;
			boolean root = false;
			
			while(!root) {	
				sqrt = (int)(Math.sqrt(length));
				if(Math.pow(sqrt, 2) == length){
					root = true;
				}else {
					length++;
					input += "*";
					root = false;
				}
			}
			
			String[][] grid = new String[sqrt][sqrt];
			int count = 0;
			
			for(int j = 0; j < sqrt; j++) {
				for(int k = 0; k < sqrt; k++) {
					grid[j][k] = String.valueOf(input.charAt(count));
					count++;
				}
			}
			int x = 0;
			int y = 0;
			String[][] grid2 = new String[sqrt][sqrt];
			for(int j = sqrt - 1; j >= 0; j--) {
				for(int k = 0; k < sqrt; k++) {
					grid2[k][j] = grid[x][y];
					y++;
				}
				x++;
				y = 0;
			}
			
			for(int j = 0; j < sqrt; j++) {
				for(int k = 0; k < sqrt; k++) {
					if(grid2[j][k].equals("*")) {
						
					}else {
						System.out.print(grid2[j][k]);						
					}
				}
			}	
			System.out.println();
		}
		
		scan.close();
	}
}