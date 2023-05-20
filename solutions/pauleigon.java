import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int serves = scan.nextInt();
		int paul = scan.nextInt();
		int oppo = scan.nextInt();
		
		int turns = paul + oppo;
		
		int count = 0;
		int servTot = 0;
		
		while(servTot <= turns) {
			count++;
			servTot += serves;
		}
		
		if(count % 2 == 0) {
			System.out.println("opponent");
		}else {
			System.out.println("paul");
		}
		
		scan.close();
	}

}