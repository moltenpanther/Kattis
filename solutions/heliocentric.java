import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = 0;
		while(scan.hasNext()) {

			int earth = scan.nextInt();
			int mars = scan.nextInt();
			int sum = 0;

			while(earth > 0 || mars > 0) {
				earth++;
				mars++;
				sum++;
				if(earth > 364) {
					earth = 0;
				}
				if(mars > 686) {
					mars = 0;
				}
			}
			count++;
			System.out.println("Case " + count + ": " + sum);
		}
		scan.close();
	}
}