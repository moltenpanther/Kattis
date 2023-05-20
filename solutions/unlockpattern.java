import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] pad = new int[3][3];
		int[] posX = new int[9];
		int[] posY = new int[9];
		double dis = 0;
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				pad[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < 9; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				for(int k = 0; k < 3; k++) {
					if(i + 1 == pad[j][k]) {
						posX[i] = j;
						posY[i] = k;
					}
				}
			}
		}
		
		for(int i = 0; i < 8; i++) {
			
			double difX = Math.abs(posX[i] - posX[i + 1]);
			double difY = Math.abs(posY[i] - posY[i + 1]);
			
			if(difX == 0) {
				dis += difY;
			}else if(difY == 0) {
				dis += difX;				
			}else {
				dis += Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
			}
		}
		
		System.out.println(dis);
		
		scan.close();
	}
}