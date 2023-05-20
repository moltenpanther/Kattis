import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int exp = 0;
		int sum = 0;

		for (int i = 1; i <= num; i++) {

			exp = scan.nextInt();
			if (exp < 0) {
				sum -= exp;
			} else {
			}
		}
		
		System.out.println(sum);

		scan.close();
	}
}