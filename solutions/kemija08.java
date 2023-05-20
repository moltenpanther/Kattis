import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String code = scan.nextLine();
		int length = code.length();

		for (int i = 0; i < length; i++) {

			char check = code.charAt(i);
			System.out.print(check);

			if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
				i += 2;
			}

		}

		scan.close();
	}

}