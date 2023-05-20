import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int start = scan.nextInt();
		int stop = scan.nextInt();
		int count = 0;

		for (int i = start; i <= stop; i++) {

			String num = String.valueOf(start);
			if (num.contains("0")) {
				start++;
			} else {

				int sum = 0;
				int smallCount = 0;
				boolean digRepeat = false;

				// Summing Up
				for (int j = 0; j <= 5; j++) {
					int dig = Integer.parseInt(num.charAt(j) + "");

					if (num.substring(j + 1, 6).contains(dig + "")) {
						digRepeat = true;
					}

					sum += dig;
				}

				while (!digRepeat) {
					// Checking if Divisible
					for (int j = 0; j <= 5; j++) {
						int dig = Integer.parseInt(num.charAt(j) + "");

						if (start % dig == 0) {
							smallCount++;
						}
					}
					// Count of Possibles
					if (smallCount == 6) {
						count++;
					}

					digRepeat = true;

				}
				start++;

			}

		}

		System.out.print(count);
		scan.close();

	}

}