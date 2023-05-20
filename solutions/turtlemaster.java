import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char[][] board = new char[8][8];
		
		for(int i = 0; i < 8; i++) {
			
			String line = scan.next();
			for(int j = 0; j < 8; j++) {
				board[i][j] = line.charAt(j);					
			}
		}
		
		boolean win = true;
		char dir = 'E';
		int r = 7;
		int c = 0;
		String line = scan.next();
		for(int i = 0; i < line.length(); i++) {
			char bit = line.charAt(i);
			if(bit == 'F') {
				
				if(dir == 'E') {
					c++;
				}else if(dir == 'N') {
					r--;
				}else if(dir == 'W') {
					c--;
				}else {
					r++;
				}
				
				if(r < 0 || r > 7 || c < 0 || c > 7 || board[r][c] == 'C' || board[r][c] == 'I') {
					win = false;
					i = line.length();
				}
											
			}else if(bit == 'L') {
				
				if(dir == 'E') {
					dir = 'N';
				}else if(dir == 'N') {
					dir = 'W';
				}else if(dir == 'W') {
					dir = 'S';
				}else {
					dir = 'E';
				}
				
			}else if(bit == 'R') {
				
				if(dir == 'E') {
					dir = 'S';
				}else if(dir == 'N') {
					dir = 'E';
				}else if(dir == 'W') {
					dir = 'N';
				}else {
					dir = 'W';
				}
				
			}else if(bit == 'X') {
				
				char face = '~';
				int y = r;
				int x = c;
				
				if(dir == 'E') {
					if(c < 7) {
						face = board[y][++x];						
					}
				}else if(dir == 'N') {
					if(r > 0) {
						face = board[--y][x];						
					}
				}else if(dir == 'W') {
					if(c > 0) {
						face = board[y][--x];						
					}
				}else {
					if(r < 7) {
						face = board[++y][x];						
					}
				}

				if(face == 'I') {
					board[y][x] = '.';
				}else {
					win = false;
					i = line.length();
				}
				
			}
			
		}
		
		if(board[r][c] != 'D') {
			win = false;
		}
		
		if(win) {
			System.out.println("Diamond!");
		}else {
			System.out.println("Bug!");
		}
		
		scan.close();
	}
	
}