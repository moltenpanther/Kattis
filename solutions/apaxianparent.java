import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String y = scan.next();
		String p = scan.next();
		String yLastTwo = y.substring(y.length() - 2, y.length());
		char yEnd = y.charAt(y.length() - 1);

		if (yEnd == 'e') {
			System.out.println(y + "x" + p);
		} else if (yEnd == 'a' || yEnd == 'i' || yEnd == 'o' || yEnd == 'u') {
			String newY = y.substring(0, y.length() - 1);
			System.out.println(newY + "ex" + p);
		} else if (yLastTwo.equals("ex")) {
			System.out.println(y + p);
		} else {
			System.out.println(y + "ex" + p);
		}

		scan.close();
	}
}