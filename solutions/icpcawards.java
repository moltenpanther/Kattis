import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		String all = "";
		int count = 0;

		for (int i = 1; i <= num; i++) {

			String uni = scan.next();
			String team = scan.next();

			if (all.contains(uni)) {
			} else {
				System.out.print("\n" + uni + " " + team);
				count++;

				if (count == 12) {
					i = num + 1;
				}
			}

			all += uni + " ";
		}

		scan.close();
	}

}