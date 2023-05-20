import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++) {

			int cals = scan.nextInt();
			int bottles = cals / 400;
			int rem = cals % 400;

			if (rem == 0) {
				System.out.println(bottles);
			} else {
				System.out.println(bottles + 1);
			}

		}

		scan.close();

	}

}