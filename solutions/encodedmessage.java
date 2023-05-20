import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		String code;
		double length = 0;
		int sq = 0;
		char decode;
		int back = 0;
		int interval = sq;

		for (int i = 1; i <= num; i++) {

			code = scan.next();
			length = code.length();
			sq = (int) (Math.pow(length, .5));
			back = 1;
			for (int j = 1; j <= sq; j++) {
				interval = sq;
				for (int k = 1; k <= sq; k++) {
					decode = code.charAt(interval - back);
					System.out.print(decode);
					interval += sq;
				}

				back++;
			}

			System.out.println();
		}

		scan.close();
	}

}