import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();
		int distance = 0;

		for (int i = 1; i <= cases; i++) {

			int stores = scan.nextInt();
			int low = 100;
			int high = 0;
			
			for (int j = 1; j <= stores; j++) {

				int spot = scan.nextInt();
				if (spot < low) {
					low = spot;
				}
				if (spot > high) {
					high = spot;
				}

			}

			distance = (2 * (high - low));
			System.out.println(distance);

		}

		scan.close();
	}

}