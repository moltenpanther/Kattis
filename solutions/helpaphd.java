import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		for (int i = 1; i <= cases; i++) {

			String eq = scan.next();

			if (eq.contains("=")) {
				System.out.println("skipped");
			} else {
				int plus = eq.indexOf("+");
				int half1 = Integer.valueOf(eq.substring(0, plus));
				int half2 = Integer.valueOf(eq.substring(plus + 1, eq.length()));

				System.out.println(half1 + half2);
			}
		}

		scan.close();

	}

}