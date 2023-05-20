import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String code = scan.next();
		int length = code.length();
		int count = 0;

		for (int i = 0; i < length; i += 3) {

			if (code.charAt(i) != 'P') {
				count++;
			} else {
			}
			if (code.charAt(i + 1) != 'E') {
				count++;
			} else {
			}
			if (code.charAt(i + 2) != 'R') {
				count++;
			} else {
			}

		}

		System.out.println(count);

		scan.close();
	}

}