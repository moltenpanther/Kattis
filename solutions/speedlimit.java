import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 1;
		int speed = 0;
		int time = 0;

		while (num == 1) {

			int sum = 0;
			int oldTime = 0;
			int newTime = 0;
			int set = scan.nextInt();

			if (set == -1) {
				num = 2;
			} else {

				for (int i = 1; i <= set; i++) {

					speed = scan.nextInt();
					time = scan.nextInt();
					newTime = time - oldTime;
					oldTime = time;

					sum += speed * newTime;

				}

				System.out.println(sum + " miles");
			}
		}

		scan.close();

	}

}