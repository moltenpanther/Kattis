import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();
		double a;
		double b;
		double c;

		for (int i = 1; i <= cases; i++) {

			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();

			if (a + b == c || a - b == c || b - a == c || a * b == c || a / b == c || b / a == c) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}

		}

		scan.close();
	}
}