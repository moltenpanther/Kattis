import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int wc = 0;
		int hc = 0;
		int ws = 0;
		int hs = 0;
		
		wc = scan.nextInt();
		hc = scan.nextInt();
		ws = scan.nextInt();
		hs = scan.nextInt();

		if((ws <= wc - 2) && (hs <= hc - 2)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
}
