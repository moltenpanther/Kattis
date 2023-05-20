import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] check = {4, 3, 2, 7, 6, 5, 0, 4, 3, 2, 1};
		
		String input = scan.next();
		
		int sum = 0;
		for(int i = 0; i < input.length(); i++) {
			
			if(i != 6) {
				int digit = Integer.valueOf(input.charAt(i)) - 48;
				sum += check[i] * digit;
			}
		}
		
		if(sum % 11 == 0) {
			System.out.println(1);			
		}else {
			System.out.println(0);
		}
		
		scan.close();
	}
}