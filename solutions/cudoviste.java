import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int rows = scan.nextInt();
		int cols = scan.nextInt();
		String lot = "";

		int count = 0;
		int car0 = 0;
		int car1 = 0;
		int car2 = 0;
		int car3 = 0;
		int car4 = 0;

		for (int i = 0; i < rows; i++) {

			lot += scan.next() + "\n";
		}

		for (int i = 1; i < lot.length() - (cols) - 1; i++) {

			char check1 = lot.charAt(i - 1);
			char check2 = lot.charAt(i);
			char check3 = lot.charAt(i + cols);
			char check4 = lot.charAt(i + cols + 1);

			if ((check1 == 'X' || check1 == '.') && (check2 == 'X' || check2 == '.') && (check3 == 'X' || check3 == '.')
					&& (check4 == 'X' || check4 == '.')) {

				String check = ("\n" + check1 + "" + check2 + "\n" + check3 + "" + check4 + "");

				count = 0;

				for (int j = 0; j < check.length(); j++) {

					if (check.charAt(j) == 'X') {
						count++;
					}
				}

				if (count == 0) {
					car0++;

				} else if (count == 1) {
					car1++;
				} else if (count == 2) {
					car2++;
				} else if (count == 3) {
					car3++;
				} else if (count == 4) {
					car4++;
				}
			}
		}

		System.out.println(car0);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);

		scan.close();

	}

}