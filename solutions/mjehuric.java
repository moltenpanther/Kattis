import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();

		int temp = 0;
		boolean order = false;

		while (order == false) {
			// Step 1
			if (num1 > num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
				System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
			}
			// Step 2
			if (num2 > num3) {
				temp = num2;
				num2 = num3;
				num3 = temp;
				System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
			}
			// Step 3
			if (num3 > num4) {
				temp = num3;
				num3 = num4;
				num4 = temp;
				System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
			}
			// Step 4
			if (num4 > num5) {
				temp = num4;
				num4 = num5;
				num5 = temp;
				System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
			}
			// Step 5 (Check)
			if (num1 == 1 && num2 == 2 && num3 == 3 && num4 == 4) {
				order = true;
			}
		}

		scan.close();

	}

}