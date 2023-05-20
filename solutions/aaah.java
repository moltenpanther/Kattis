import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String ah1 = scan.next();
		String ah2 = scan.next();

		if (ah1.length() >= ah2.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}

		scan.close();
	}

}