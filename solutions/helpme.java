import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[][] board = new String[17][33];
		String[] row = {"1", "2", "3", "4", "5", "6", "7", "8"};
		String[] col = {"a", "b", "c", "d", "e", "f", "g", "h"};

		int rCount = 0;
		int cCount = 0;
		
		for(int i = 0; i < 17; i++) {
			
			String line = scan.next();
			for(int j = 0; j < 33; j++) {
				
				board[i][j] = String.valueOf(line.charAt(j));
			}
		}
		
		String white = "White: ";
		
		//White Kings
		rCount = 0;
		for(int i = 15; i >= 1; i -= 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("K")) {
					white += "K" + col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount++;
		}
		
		//White Queens
		rCount = 0;
		for(int i = 15; i >= 1; i -= 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("Q")) {
					white += "Q" + col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount++;
		}
		
		//White Rooks
		rCount = 0;
		for(int i = 15; i >= 1; i -= 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("R")) {
					white += "R" + col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount++;
		}
		//White Bishops
		rCount = 0;
		for(int i = 15; i >= 1; i -= 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("B")) {
					white += "B" + col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount++;
		}
		//White Knights
		rCount = 0;
		for(int i = 15; i >= 1; i -= 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("N")) {
					white += "N" + col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount++;
		}
		//White Pawns
		rCount = 0;
		for(int i = 15; i >= 1; i -= 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("P")) {
					white += col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount++;
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		String black = "Black: ";
		//Black Kings
		rCount = 7;
		for(int i = 1; i <= 15; i += 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("k")) {
					black += "K" + col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount--;
		}
		
		//Black Queens
		rCount = 7;
		for(int i = 1; i <= 15; i += 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("q")) {
					black += "Q" + col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount--;
		}
		
		//Black Rooks
		rCount = 7;
		for(int i = 1; i <= 15; i += 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("r")) {
					black += "R" + col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount--;
		}
		//Black Bishops
		rCount = 7;
		for(int i = 1; i <= 15; i += 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("b")) {
					black += "B" + col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount--;
		}
		//Black Knights
		rCount = 7;
		for(int i = 1; i <= 15; i += 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("n")) {
					black += "N" + col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount--;
		}
		//Black Pawns
		rCount = 7;
		for(int i = 1; i <= 15; i += 2) {
			cCount = 0;
			for(int j = 2; j <= 30; j += 4) {
				
				if(board[i][j].equals("p")) {
					black += col[cCount] + row[rCount] + ",";
				}
				cCount++;
			}	
			rCount--;
		}
		
		System.out.println(white.substring(0, white.length() - 1));
		System.out.println(black.substring(0, black.length() - 1));
		
		scan.close();
	}

}