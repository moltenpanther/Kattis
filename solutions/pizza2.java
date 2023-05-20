import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double rad = scan.nextInt();
		double crust = scan.nextInt();
		double pi = 3.141529625;

		double area = pi * Math.pow(rad, 2);
		double cheese = pi * Math.pow(rad - crust, 2);

		double ans = (cheese / area) * 100;

		System.out.printf("%.6f", ans);

		scan.close();

	}

}