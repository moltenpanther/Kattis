import java.util.Scanner;

public class reversebinary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		String bin = Integer.toBinaryString(num);
		
		String binRev = "";
		for (int i = bin.length(); i > 0; i--) {
			binRev += bin.substring(i - 1, i);
		}

		int rev = Integer.parseInt(binRev, 2);
		System.out.println(rev);

		scan.close();
	}

}
