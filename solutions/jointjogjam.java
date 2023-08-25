import java.util.Scanner;

public class jointjogjam {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int kxStart = scan.nextInt();
		int kyStart = scan.nextInt();
		int oxStart = scan.nextInt();
		int oyStart = scan.nextInt();
		int kxEnd = scan.nextInt();
		int kyEnd = scan.nextInt();
		int oxEnd = scan.nextInt();
		int oyEnd = scan.nextInt();
		
		double dis1 = Math.sqrt(Math.pow(kxStart - oxStart, 2) + Math.pow(kyStart - oyStart, 2));
		double dis2 = Math.sqrt(Math.pow(kxEnd - oxEnd, 2) + Math.pow(kyEnd - oyEnd, 2));
		
		System.out.println(Math.max(dis1, dis2));
		
		scan.close();
	}

}
