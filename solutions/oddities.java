import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int test;
		
		for(int i = 1; i <= n; i++) {
			
			test = scan.nextInt();
			if(test % 2 == 0) {
				System.out.println(test + " is even");
			}else {
				System.out.println(test + " is odd");
			}
		}
		
		scan.close();
	}
}