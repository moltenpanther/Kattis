import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String name = scan.next() + " ";
		int length = name.length() - 1;

		for (int i = 0; i < length; i++) {

			System.out.print(name.charAt(i));

			while (name.charAt(i) == name.charAt(i + 1)) {
				i++;
			}

		}
		scan.close();
	}

}