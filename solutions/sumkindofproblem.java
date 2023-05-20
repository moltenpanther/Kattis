import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int sets = scan.nextInt();

		for (int i = 1; i <= sets; i++) {

			int set = scan.nextInt();
			int num = scan.nextInt();
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;

			for (int j = 1; j <= num; j++) {
				sum1 += j;
			}

			sum2 = sum1 * 2 - num;
			sum3 = sum2 + num;

			System.out.print(set + " " + sum1 + " " + sum2 + " " + sum3 + "\n");

		}

		scan.close();
	}

}