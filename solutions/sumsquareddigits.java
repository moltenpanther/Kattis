import java.util.Scanner;

public class sumsquareddigits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			scan.nextInt();
			int base = scan.nextInt();
			int inp = scan.nextInt();
			
			int sum = 0;
			while(inp > 0) {
				int rem = inp % base;
				sum += Math.pow(rem, 2);
				inp /= base;			
			}
			
			System.out.println((i + 1) + " " + sum);
		}
		
		scan.close();
	}
		
}