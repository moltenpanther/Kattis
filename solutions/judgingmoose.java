import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int left = scan.nextInt();
		int right = scan.nextInt();

		if (left + right == 0) {
			System.out.println("Not a moose");
		} else if (left == right) {
			System.out.println("Even " + left * 2);
		} else {
			if (left > right) {
				System.out.println("Odd " + left * 2);
			} else {
				System.out.println("Odd " + right * 2);
			}
		}

		scan.close();
	}
}