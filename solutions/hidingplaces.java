import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hidingplaces {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int num = scan.nextInt();
		
		for(int k = 0; k < num; k++) {
			
			HashSet<String> checked = new HashSet<String>();
			int[][] board = new int[8][8];
			
			int[] chessRow = {8, 7, 6, 5, 4, 3, 2, 1};
			char[] chessCol = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
			
			String knight = scan.next();
			
			int knightRow = 8 - (knight.charAt(1) - '0');
			int knightCol = knight.charAt(0) - 'a';
			board[knightRow][knightCol] = 0;
			
			Queue<String> queue = new LinkedList<String>();
			String coord = knightRow + "" + knightCol;
			queue.add(coord);
			checked.add(coord);
			
			int moves = 0;
			while(queue.size() > 0) {
				
				int i = Integer.parseInt(String.valueOf(coord.charAt(0)));
				int j = Integer.parseInt(String.valueOf(coord.charAt(1)));			
				
				moves = board[i][j] + 1;
				
				// Check all 8 locations
				// UP
				if(i > 1) {
					// UP LEFT
					if(j > 0) {
						coord = (i - 2) + "" + (j - 1);
						if(!checked.contains(coord)) {
							queue.add(coord);
							checked.add(coord);
							board[i - 2][j - 1] = moves; 
						}
					}
					// UP RIGHT
					if(j < 7) {
						coord = (i - 2) + "" + (j + 1);
						if(!checked.contains(coord)) {
							queue.add(coord);
							checked.add(coord);
							board[i - 2][j + 1] = moves; 
						}
					}
				}
				// DOWN
				if(i < 6) {
					// DOWN LEFT
					if(j > 0) {
						coord = (i + 2) + "" + (j - 1);
						if(!checked.contains(coord)) {
							queue.add(coord);
							checked.add(coord);
							board[i + 2][j - 1] = moves;
						}
					}
					// DOWN RIGHT
					if(j < 7) {
						coord = (i + 2) + "" + (j + 1);
						if(!checked.contains(coord)) {
							queue.add(coord);
							checked.add(coord);
							board[i + 2][j + 1] = moves;
						}
					}
				}
				// LEFT
				if(j > 1) {
					// LEFT UP
					if(i > 0) {
						coord = (i - 1) + "" + (j - 2);
						if(!checked.contains(coord)) {
							queue.add(coord);
							checked.add(coord);
							board[i - 1][j - 2] = moves;
						}
					}
					// LEFT DOWN
					if(i < 7) {
						coord = (i + 1) + "" + (j - 2);
						if(!checked.contains(coord)) {
							queue.add(coord);
							checked.add(coord);
							board[i + 1][j - 2] = moves;
						}
					}
				}
				// RIGHT
				if(j < 6) {
					// RIGHT UP
					if(i > 0) {
						coord = (i - 1) + "" + (j + 2);
						if(!checked.contains(coord)) {
							queue.add(coord);
							checked.add(coord);
							board[i - 1][j + 2] = moves;
						}
					}
					// RIGHT DOWN
					if(i < 7) {
						coord = (i + 1) + "" + (j + 2);
						if(!checked.contains(coord)) {
							queue.add(coord);
							checked.add(coord);
							board[i + 1][j + 2] = moves;
						}
					}
				}
							
				coord = queue.remove();
			}
			
			// Find Max
			int max = -1;
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(board[i][j] > max) {
						max = board[i][j];
					}
				}
			}
			
			// Print Answer
			System.out.print(max + " ");
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					if(board[i][j] == max) {
						System.out.print(chessCol[j] + "" + chessRow[i] + " ");
					}
				}
			}
			System.out.println();
		}
		scan.close();
	}
	
}