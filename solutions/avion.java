import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;

		for (int i = 1; i <= 5; i++) {

			String blimp = scan.next();

			if (blimp.contains("FBI")) {
				System.out.print(i + " ");
				count++;
			}

		}

		if (count == 0) {
			System.out.println("HE GOT AWAY!");
		}

		scan.close();
	}

}