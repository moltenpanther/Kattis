import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long ans = 1;
		
		long num = scan.nextInt();
		for(long i = 0; i < num; i++) {
			
			long num1 = scan.nextInt();
			String symbol = scan.next();
			long num2 = scan.nextInt();
			
			if(symbol.equals("+")) {
				ans = add(ans, num1, num2);
			}else if(symbol.equals("-")) {
				ans = subtract(ans, num1, num2);
			}else if(symbol.equals("*")) {
				ans = multiply(num1, num2);
			}else if(symbol.equals("/")) {
				ans = divide(num1);
			}
						
			System.out.println(ans);

		}

		scan.close();
	}
	
	public static long add(long ans, long num1, long num2) {
		
		return num1 + num2 - ans;		
	}

	public static long subtract(long ans, long num1, long num2) {
		
		return (num1 - num2) * ans;
	}
	
	public static long multiply(long num1, long num2) {
		
		return num1 * num1 * num2 * num2;
	}
	
	public static long divide(long num1) {
		
		if(num1 % 2 == 0) {
			return num1 / 2;
		}else {
			return (num1 + 1) / 2;
		}
		
	}
}
