import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		for (int i = 1; i <= cases; i++) {

			int stops = scan.nextInt();
			double sum = 0;

			for (int j = 1; j <= stops; j++) {

				sum += .5;
				sum *= 2;

			}

			System.out.printf("%.0f\n", sum);

		}

		scan.close();
	}

}