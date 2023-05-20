import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lines = scan.nextInt();
		boolean gj = true;

		for (int i = 1; i <= lines; i++) {

			int num = scan.nextInt();

			while (num != i) {

				System.out.println(i);
				i++;
				lines++;
				gj = false;
			}

		}
		if (gj) {
			System.out.println("good job");
		} else {

		}

		scan.close();

	}

}