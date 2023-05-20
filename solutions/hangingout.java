import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int limit = scan.nextInt();
		int events = scan.nextInt();
		int pop = 0;
		int rejects = 0;

		for (int i = 1; i <= events; i++) {

			String check = scan.next();
			int num = scan.nextInt();

			if (check.equals("enter") && pop + num <= limit) {
				pop += num;
			} else if (check.equals("enter") && pop + num > limit) {
				rejects++;
			} else {
				pop -= num;
			}

		}

		System.out.println(rejects);

		scan.close();
	}
}