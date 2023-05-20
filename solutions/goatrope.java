import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		double disX = 99999;
		double disY = 99999;
		
		double disTL = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y2 - y, 2));
		double disTR = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
		double disBL = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
		double disBR = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y1 - y, 2));
		
		// 7 3 0 0 5 4
		
		if(x < x1) {
			if(y < y1) {
				disX = disBL;
			}else if(y > y2) {
				disX = disTL;
			}else {
				// (x1, y1) (x1, y2)
				disX = Math.abs((y1 - y2) * x + (x1 * y2 - x1 * y1)) / Math.abs(y1 - y2);
			}
			
		}else if(x > x2){
			if(y < y1) {
				disX = disBR;
			}else if(y > y2) {
				disX = disTR;
			}else {
			// (x2, y1) (x2, y2)
			disX = Math.abs((y1 - y2) * x + (x2 * y2 - x2 * y1)) / Math.abs(y1 - y2);
			}		
		}
		
		if(y > y2) {
			if(x < x1) {
				disY = disTL;
			}else if(x > x2) {
				disY = disTR;
			}else {
			// (x1, y2) (x2, y2)
			disY = Math.abs((x2 - x1) * y + (x1 * y2 - x2 * y2)) / Math.abs(x2 - x1);
			}
		}else if(y < y1){
			if(x < x1) {
				disY = disBL;
			}else if(x > x2) {
				disY = disBR;
			}else {
			// (x1, y1) (x2, y1)
			disY = Math.abs((x2 - x1) * y + (x1 * y1 - x2 * y1)) / Math.abs(x2 - x1);
			}
		}
		
		System.out.println(Math.min(disX, disY));
		
		scan.close();
	}

}