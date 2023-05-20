import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {

			String color = scan.next();
			String noCaps = color.toLowerCase();

			if (noCaps.contains("pink") || noCaps.contains("rose")) {
				count++;
			} else {

			}
		}

		if (count == 0) {
			System.out.println("I must watch Star Wars with my daughter");
		} else {
			System.out.println(count);
		}

		scan.close();
	}
}