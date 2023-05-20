import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		for (int i = 1; i <= cases; i++) {

			int trips = scan.nextInt();
			String fullList = "";
			int count = 0;
			for (int j = 1; j <= trips; j++) {

				String city = scan.next();				

				if (fullList.contains(city)) {
				} else {
					count++;
				}
				
				fullList = fullList + city;

			}
		
			System.out.println(count);

		}

		scan.close();
	}

}