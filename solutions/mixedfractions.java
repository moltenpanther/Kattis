import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean end = false;

		while (end == false) {
			int num = scan.nextInt();
			int denom = scan.nextInt();

			if (num == 0 && denom == 0) {
				end = true;
			} else {
				int whole = num / denom;
				int rem = num % denom;
				System.out.println(whole + " " + rem + " / " + denom);
			}

		}

		scan.close();

	}

}