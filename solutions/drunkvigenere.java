import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String code = scan.next();
		String key = scan.next();
		int length = code.length();

		for (int i = 0; i < length; i++) {
			// Evens

			if (i % 2 == 0) {
				int num = (code.charAt(i)) - (key.charAt(i) - 65);

				while (num < 65) {
					num += 26;
				}
				while (num > 90) {
					num -= 26;
				}
				System.out.print((char) num);

				// Odds
			} else {

				int num = (code.charAt(i)) + (key.charAt(i) - 65);
				
				while (num < 65) {
					num += 26;
				}
				while (num > 90) {
					num -= 26;
				}
				
				System.out.print((char) num);
			}

		}
		scan.close();

	}

}