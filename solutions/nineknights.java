import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char[][] board = {{'.', '.', '.', '.', '.'},
						  {'.', '.', '.', '.', '.'},
						  {'.', '.', '.', '.', '.'},
						  {'.', '.', '.', '.', '.'},
						  {'.', '.', '.', '.', '.'}};
		
		int count = 0;
		for(int i = 0; i < 5; i++) {
			
			String line = scan.next();
			for(int j = 0; j < 5; j++) {
				
				if(line.charAt(j) == 'k') {
					board[i][j] = 'k';
					count++;
				}
			}
		}
		
		boolean check = true;

		if(count == 9) {			
			
			for(int i = 0; i < 5; i++) {
	
				check = true;
				for(int j = 0; j < 5; j++) {
					if(board[i][j] == 'k') {
						check = kCheck(board, i, j);
					}
					
					if(!check) {
						i = 5;
						j = 5;
					}	
				}
			}
						
		}else {
			check = false;
		}
		
		if(check) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
		scan.close();
	}
	
	public static boolean kCheck(char[][] board, int i, int j) {
		
		if(j - 2 > -1 && i - 1 > -1) {
			if(board[i - 1][j - 2] == 'k') {
				return false;
			}
		}
		
		if(j - 2 > -1 && i + 1 < 5) {
			if(board[i + 1][j - 2] == 'k') {
				return false;
			}
		}
		
		if(j + 2 < 5 && i - 1 > -1) {
			if(board[i - 1][j + 2] == 'k') {
				return false;
			}
		}
		
		if(j + 2 < 5 && i + 1 < 5) {
			if(board[i + 1][j + 2] == 'k') {
				return false;
			}
		}
		
		if(i - 2 > -1 && j - 1 > -1) {
			if(board[i - 2][j - 1] == 'k') {
				return false;
			}
		}
		
		if(i - 2 > -1 && j + 1 < 5) {
			if(board[i - 2][j + 1] == 'k') {
				return false;
			}
		}
		
		if(i + 2 < 5 && j - 1 > -1) {
			if(board[i + 2][j - 1] == 'k') {
				return false;
			}
		}
		
		if(i + 2 < 5 && j + 1 < 5) {
			if(board[i + 2][j + 1] == 'k') {
				return false;
			}
		}
		
		return true;
	}
	
}