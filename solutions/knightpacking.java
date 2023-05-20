import java.util.Scanner;

public class knightpacking {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("second");
		}else {
			System.out.println("first");
		}
		
		scan.close();
	}
		
}