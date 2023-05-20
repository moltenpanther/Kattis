import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num % 2 != 0) {
			System.out.println("Either");
		}else if(num % 4 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}

		scan.close();

	}

}