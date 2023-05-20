import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int groups = scan.nextInt();

		for (int i = 1; i <= groups; i++) {

			int gnomes = scan.nextInt();
			int oldNum;
			int num = 0;
			boolean check = true;

			for (int j = 1; j <= gnomes; j++) {

				oldNum = num;
				num = scan.nextInt();

				if (j == 1 || check == false) {

				} else {
					if (oldNum != num - 1) {
						System.out.println(j);
						check = false;

					}

				}

			}

		}

		scan.close();

	}

}