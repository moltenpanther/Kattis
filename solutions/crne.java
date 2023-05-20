import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {
    	
		Scanner scan = new Scanner(System.in);
		
		long numInit = scan.nextInt();
		long num1 = numInit / 2;
		long num2 = 0;
				
		if(numInit % 2 == 0) {
			num2 = num1;
		}else {
			num2 = num1 + 1;		
		}
		
		System.out.println((num1 + 1) * (num2 + 1));
		
		scan.close();
	}
	
}