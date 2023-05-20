import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int len = scan.nextInt();
		int rad = scan.nextInt();
		
		double sqDiag = Math.sqrt((len * len) * 2);
		
		if(sqDiag <= rad * 2) {
			System.out.println("fits");
		}else {
			System.out.println("nope");
		}
		
		scan.close();
	}
}