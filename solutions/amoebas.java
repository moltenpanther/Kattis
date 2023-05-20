import java.util.Scanner;
import java.util.Stack;

public class amoebas {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		
		String map = "";
		for(int i = 0; i < rows; i++) {
			map += scan.next(); 
		}		
		
		Square[][] grid = scanMap(map, rows, cols);

		int count = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(grid[i][j].color == 'W') {
					dfs(grid, i, j);					
					count++;
				}
				
			}
		}
		
		
		System.out.println(count);
		
		scan.close();
	}
	
	public static Square[][] scanMap(String line, int rows, int cols) {
		
		Square[][] grid = new Square[rows][cols];
		
		int count = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				char ch = line.charAt(count++);
				Square space = new Square(i, j, ch);
				grid[i][j] = space;
			}
		}
		
		return grid;
	}

	public static void dfs(Square[][] grid, int rows, int cols) {
		
		Square start = grid[rows][cols];
		Stack<Square> stack = new Stack<Square>();
		
		int row = grid.length;
		int col = grid[0].length;
		
		stack.push(start);
		
		int time = 0;
		while(stack.size() > 0) {
			
			time++;
			Square space = stack.pop();
			space.dis = time;
			space.color = 'G';
			
			int r = space.row;
			int c = space.col;
			Square next;
						
			// Check all 8 directions
			// Up
			if(r > 0) {		
				next = grid[r - 1][c];
				if(next.color == 'W') {
					next.prev = space;
					stack.add(next);
				}
			}
			// Right
			if(c < col - 1) {	
				next = grid[r][c + 1];
				if(next.color == 'W') {
					next.prev = space;
					stack.add(next);
				}
			}
			// Down
			if(r < row - 1) {
				next = grid[r + 1][c];
				if(next.color == 'W') {
					next.prev = space;
					stack.add(next);
				}
			}
			// Left
			if(c > 0) {				
				next = grid[r][c - 1];
				if(next.color == 'W') {
					next.prev = space;
					stack.add(next);
				}
			}
			// U/R
			if(r > 0 && c < col - 1) {				
				next = grid[r - 1][c + 1];
				if(next.color == 'W') {
					next.prev = space;
					stack.add(next);
				}
			}
			// D/R
			if(r < row - 1 && c < col - 1) {				
				next = grid[r + 1][c + 1];
				if(next.color == 'W') {
					next.prev = space;
					stack.add(next);
				}
			}
			// D/L
			if(r < row - 1 && c > 0) {				
				next = grid[r + 1][c - 1];
				if(next.color == 'W') {
					next.prev = space;
					stack.add(next);
				}
			}
			// U/L
			if(r > 0 && c > 0) {				
				next = grid[r - 1][c - 1];
				if(next.color == 'W') {
					next.prev = space;
					stack.add(next);

				}
			}
			
			space.color = 'B';
			time++;
			space.fin = time;
			
		}
						
	}
	
}

class Square {
	
	char color = 'W';
	int dis = Integer.MAX_VALUE;
	Square prev = null;
	int row = 0;
	int col = 0;
	char val = '.';
	int fin = 0;
	
	public Square() {
		
	}
	
	public Square(int row, int col, char val) {
		this.row = row;
		this.col = col;
		this.val = val;
		if(val == '.') {
			color = 'B';
		}
		if(val == '#') {
			color = 'W';
		}
	}
	
}
