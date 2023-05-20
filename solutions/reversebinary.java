import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		String bin = Integer.toBinaryString(num);
		int len = bin.length();
		String dig = "";
		String binRev = "";
		int rev = 0;

		for (int i = len; i > 0; i--) {

			dig = bin.substring(i - 1, i);
			binRev += dig;

		}

		rev = Integer.parseInt(binRev, 2);
		System.out.println(rev);

		scan.close();
	}

}