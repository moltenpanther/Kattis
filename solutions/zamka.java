import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lower = scan.nextInt();
		int upper = scan.nextInt();
		int ans = scan.nextInt();
		int length = 0;
		int digit = 0;
		int sum = 0;
		
		
		for (int i = lower; i <= upper; i++) {
			
			String entry = String.valueOf(i);
			length = entry.length() - 1;
			sum = 0;
			
			for (int j = 0; j <= length; j++) {
				
				digit = entry.charAt(j) - '0';
				sum += digit;
				
			}
			if (sum == ans) {

				System.out.println(i);
				i = upper;
			} else {
				sum = 0;
			}
		}
	
		
		for (int i = upper; i >= lower; i--) {

			String entry = String.valueOf(i);
			length = entry.length() - 1;
			sum = 0;
			
			for (int j = 0; j <= length; j++) {
				
				digit = entry.charAt(j) - '0';
				sum += digit;
				
			}
			if (sum == ans) {

				System.out.println(i);
				i = lower;
				
			} else {
				sum = 0;
			}
		}
		
		scan.close();
	}

}