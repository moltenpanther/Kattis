import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class islands3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		scan.nextLine();
		Square[][] map = new Square[rows][cols];

		for(int i = 0; i < rows; i++) {
			String line = scan.nextLine();
			for(int j = 0; j < cols; j++) {
				char ch = line.charAt(j);
				map[i][j] = new Square(ch, i, j);
			}
		}
		
		int count = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(map[i][j].color == 'W' && map[i][j].val == 'L') {
					bfs(map, i, j);
					count++;
				}
			}
		}

		System.out.println(count);
		
		scan.close();
	}
	
	
	public static void bfs(Square[][] map, int row, int col) {
		
		Square start = map[row][col];
		start.color = 'G';
		start.dis = 0;
		
		Queue<Square> queue = new LinkedList<Square>();
		queue.add(start);
		
		while(queue.size() > 0) {

			Square space = queue.remove();
			
			int r = space.row;
			int c = space.col;
			
			Square next;
			// Check all 4 directions
			// Up
			if(r > 0) {
				next = map[r - 1][c];
				if(next.color == 'W') {
					next.color = 'G';
					next.dis = space.dis + 1;
					next.prev = space;
					queue.add(next);
				}
			}
			// Right
			if(c < map[r].length - 1) {					
				next = map[r][c + 1];
				if(next.color == 'W') {
					next.color = 'G';
					next.dis = space.dis + 1;
					next.prev = space;
					queue.add(next);
				}
			}
			// Down
			if(r < map.length - 1) {				
				next = map[r + 1][c];
				if(next.color == 'W') {
					next.color = 'G';
					next.dis = space.dis + 1;
					next.prev = space;
					queue.add(next);
				}
			}
			// Left
			if(c > 0) {				
				next = map[r][c - 1];
				if(next.color == 'W') {
					next.color = 'G';
					next.dis = space.dis + 1;
					next.prev = space;
					queue.add(next);
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
	char val = ' ';
	int row;
	int col;
	
	public Square(char val, int row, int col) {
		this.val = val;
		this.row = row;
		this.col = col;
		if(val == 'L') {
			color = 'W';
		}else if(val == 'C') {
			color = 'W';
		}else {
			color = 'B';
		}
	}
	
	public String toString() {
		
		return val + ": " + row + "/" + col;
	}
	
}