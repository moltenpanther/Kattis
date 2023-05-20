import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double x1 = 1;
		
		while(x1 != 0) {
			
			x1 = scan.nextDouble();
			
			if(x1 != 0) {
				
				double y1 = scan.nextDouble();
				double x2 = scan.nextDouble();
				double y2 = scan.nextDouble();
				double p = scan.nextDouble();
				
				double ans = Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y2 - y1), p), (1/p));
			
			System.out.println(ans);
			}
		}
		scan.close();
	}
}