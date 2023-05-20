import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int day = 0;
		int nextDay = 100001;
		int daysTil = 0;
		
		for (int i = 0; i < n; i++) {

			day = scan.nextInt();
			if (day < nextDay) {
				nextDay = day;
				daysTil = i;
			} else {
			}

		}

		System.out.println(daysTil);

		scan.close();
	}
}