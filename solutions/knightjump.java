import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class knightjump {
	
	static int startR = 0;
	static int startC = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String inp = "";
		
		for(int i = 0; i < num; i++) {
			inp += scan.next();
		}
		
		Square[][] board = buildMap(inp, num);	
		
		bfs(board);
		
		int dis = board[0][0].dis;
		
		if(dis == 2147483647) {
			dis = -1;
		}
		System.out.println(dis);
		
		scan.close();	
	}
	
	public static Square[][] buildMap(String line, int num) {

		Square[][] board = new Square[num][num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				
				char ch = line.charAt(j + (num * i));
				Square space = new Square(i, j, ch);
				board[i][j] = space;
				
				if(ch == 'K') {
					startR = i;
					startC = j;
				}
			}
		}

		return board;
	}
	
	public static void bfs(Square[][] board) {
		
		Square start = board[startR][startC];
		start.color = 'G';
		start.dis = 0;
		
		Queue<Square> queue = new LinkedList<Square>();
		queue.add(start);
		
		int num = board.length;
		
		while(queue.size() > 0) {
						
			Square space = queue.remove();
			int r = space.row;
			int c = space.col;
			
			Square next;
            // Check all 8 locations
            // UP
            if(r > 1) {
                // UP LEFT
                if(c > 0) {
        			next = board[r - 2][c - 1];
        			if(next.color == 'W') {        				
	    				next.color = 'G';
	    				next.dis = space.dis + 1;
	    				next.prev = space;
	    				queue.add(next);
        			}
                }
                // UP RIGHT
                if(c < num - 1) {
        			next = board[r - 2][c + 1];
        			if(next.color == 'W') {
	    				next.color = 'G';
	    				next.dis = space.dis + 1;
	    				next.prev = space;
	    				queue.add(next);
        			}
                }
            }
            // DOWN
            if(r < num - 2) {
                // DOWN LEFT
                if(c > 0) {
        			next = board[r + 2][c - 1];
        			if(next.color == 'W') {
	    				next.color = 'G';
	    				next.dis = space.dis + 1;
	    				next.prev = space;
	    				queue.add(next);
        			}
                }
                // DOWN RIGHT
                if(c < num - 1) {
        			next = board[r + 2][c + 1];
        			if(next.color == 'W') {
	    				next.color = 'G';
	    				next.dis = space.dis + 1;
	    				next.prev = space;
	    				queue.add(next);
        			}
                }
            }
            // LEFT
            if(c > 1) {
                // LEFT UP
                if(r > 0) {
        			next = board[r - 1][c - 2];
        			if(next.color == 'W') {
	    				next.color = 'G';
	    				next.dis = space.dis + 1;
	    				next.prev = space;
	    				queue.add(next);
	        		}
                }
                // LEFT DOWN
                if(r < num - 1) {
        			next = board[r + 1][c - 2];
        			if(next.color == 'W') {
	    				next.color = 'G';
	    				next.dis = space.dis + 1;
	    				next.prev = space;
	    				queue.add(next);
        			}
                }
            }
            // RIGHT
            if(c < num - 2) {
                // RIGHT UP
                if(r > 0) {
        			next = board[r - 1][c + 2];
        			if(next.color == 'W') {
	        			next.color = 'G';
	    				next.dis = space.dis + 1;
	    				next.prev = space;
	    				queue.add(next);
        			}
                }
                // RIGHT DOWN
                if(r < num - 1) {
        			next = board[r + 1][c + 2];
        			if(next.color == 'W') {
	    				next.color = 'G';
	    				next.dis = space.dis + 1;
	    				next.prev = space;
	    				queue.add(next);
        			}
                }
            }
			space.color = 'B';
			
		}
		
		
		
	}	
	
}


class Square {
	
	char color = 'W';
	int dis = Integer.MAX_VALUE;
	Square prev = null;
	int row = 0;
	int col = 0;
	char val = ' ';
	
	public Square() {

	}
	
	public Square(int row, int col, char val) {
		this.row = row;
		this.col = col;
		this.val = val;
		if(val == '#') {
			color = 'B';
		}
	}
	
}
