import java.util.HashMap;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {

		HashMap<String, Integer> visited = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		
		int row = scan.nextInt();
		int col = scan.nextInt();
		
		char[][] map = new char[row][col];
		
		for(int i = 0; i < row; i++) {
			
			String line = scan.next();
			for(int j = 0; j < line.length(); j++) {
				map[i][j] = line.charAt(j);
			}

		}
		
		//Map Traversal
		boolean lost = false;
		boolean out = false;
		boolean win = false;
		int r = 0;
		int c = 0;
		int count = -1;
		char spot = map[r][c];
		while(!lost && !out && !win) {
						
			String place = r + " " + c;
			if(visited.containsKey(place)) {
				lost = true;
			}
			visited.put(place, 0);
			
			if(spot == 'N') {
				r--;
			}else if(spot == 'S') {
				r++;
			}else if(spot == 'W') {
				c--;
			}else if(spot == 'E') {
				c++;
			}else if(spot == 'T') {
				win = true;
			}
			count++;
			if(r >= row || c >= col || r < 0 || c < 0) {
				out = true;
			}else {
				spot = map[r][c];				
			}
			
			
		}
		
		if(lost) {
			System.out.println("Lost");
		}else if(out) {
			System.out.println("Out");
		}else if(win) {
			System.out.println(count);
		}
		
		
		scan.close();
	}
	
}
