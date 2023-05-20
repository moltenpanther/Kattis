import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Variables
		String code = scan.next();
		int length = code.length();
		String half1New = "";
		String half2New = "";
		int sum = 0;
		int hl = length / 2;
		String ans = "";

		// Divide
		String half1 = code.substring(0, hl);
		String half2 = code.substring(hl, length);

		// Rotate First Half
		for (int i = 0; i < hl; i++) {
			int num = half1.charAt(i);
			sum += num - 65;
		}
		int key1 = sum;
		for (int i = 0; i < hl; i++) {
			int num = half1.charAt(i);
			int numNew = num + key1;

			while (numNew > 90) {
				numNew -= 26;
			}
			half1New += String.valueOf((char) numNew);
		}
		sum = 0;

		// Rotate Second Half
		for (int i = 0; i < hl; i++) {
			int num = half2.charAt(i);
			sum += num - 65;
		}
		int key2 = sum;
		for (int i = 0; i < hl; i++) {
			int num = half2.charAt(i);
			int numNew = num + key2;

			while (numNew > 90) {
				numNew -= 26;
			}
			half2New += String.valueOf((char) numNew);
		}

		// Merge
		for (int i = 0; i < hl; i++) {

			int num1 = half1New.charAt(i);
			int num2 = half2New.charAt(i) - 65;
			int end = num1 + num2;
			while (end > 90) {
				end -= 26;
			}
			ans += String.valueOf((char) end);
		}
		System.out.println(ans);

		scan.close();
	}

}