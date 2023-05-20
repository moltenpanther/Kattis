import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sum = scan.nextInt() + scan.nextInt();
		int div = scan.nextInt();
		int rem = 0;
		int count = 0;
		
		while(sum / div != 0) {
			rem = sum % div;
			sum = (sum / div);
			count += sum;
			sum += rem;
		}
		
		System.out.println(count);
			
		scan.close();
	}
	
}