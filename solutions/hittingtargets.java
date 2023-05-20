import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		int num = Integer.valueOf(scan.next());
		
		String[] shapes = new String[num];
		int[][] points = new int[num][4];
		
		for(int i = 0; i < num; i++) {
			shapes[i] = scan.next();
			if(shapes[i].charAt(0) == 'r') {
				for(int j = 0; j < 4; j++) {
					points[i][j] = Integer.valueOf(scan.next());
				}
			}else {
				for(int j = 0; j < 3; j++) {
					points[i][j] = Integer.valueOf(scan.next());
				}
			}
		}
		
		num = Integer.valueOf(scan.next());
		int hits = 0;
		
		for(int i = 0; i < num; i++) {
			
			int x = Integer.valueOf(scan.next());
			int y = Integer.valueOf(scan.next());
			
			for(int j = 0; j < shapes.length; j++) {
				
				if(shapes[j].charAt(0) == 'r') {
					if(x >= points[j][0] && x <= points[j][2] && y >= points[j][1] && y <= points[j][3]) {
						hits++;
					}
				}else {	
					double dis = Math.sqrt(Math.pow(points[j][0] - x, 2) + Math.pow(points[j][1] - y, 2));
					if(dis <= points[j][2]) {
						hits++;
					}
				}
			}

			System.out.println(hits);
			hits = 0;
		}
		
		
		scan.close();
	}

}