import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int player = scan.nextInt();
		int qNum = scan.nextInt();
		int clock = 210;

		for (int i = 1; i <= qNum; i++) {

			int time = scan.nextInt();
			String ans = scan.next();

			clock -= time;

			if (clock <= 0) {
				System.out.println(player);
				clock += 9999;
			}

			if (ans.equals("T")) {
				player++;

				if (player == 9) {
					player = 1;
				}

			}

		}

		scan.close();

	}

}