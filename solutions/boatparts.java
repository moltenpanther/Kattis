import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int parts = scan.nextInt();
		int days = scan.nextInt();
		int count = 0;
		String all = "";
		int ans = 0;

		for (int i = 1; i <= days; i++) {

			String part = scan.next();
			if (all.contains(part)) {

			} else {

				all += part;
				count++;
			}
			if (count == parts) {
				ans = i;
				count++;
			}
		}

		if (ans != 0) {
			System.out.println(ans);
		} else {
			System.out.println("paradox avoided");
		}

		scan.close();
	}

}