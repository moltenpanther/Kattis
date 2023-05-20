import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double deg = 0;
		double ans = 0;
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		deg = Math.toRadians(num2);
		ans = Math.ceil(num1 / Math.sin(deg));

		System.out.printf("%.0f", ans);

		scan.close();
	}

}