import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {

			String str1 = scan.next();
			String str2 = scan.next();
			int length = str1.length();

			System.out.println(str1 + "\n" + str2);

			for (int j = 0; j <= length - 1; j++) {

				if (str1.charAt(j) == str2.charAt(j)) {
					System.out.print(".");
				} else {
					System.out.print("*");
				}

			}

			System.out.println();

		}

		scan.close();
	}

}