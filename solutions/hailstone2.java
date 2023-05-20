import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long num = scan.nextLong();
		
		System.out.println(1 + sumHail(num));			
		scan.close();	
	}
	
	public static long sumHail(long num) {
		
		if(num == 1) {
			return 0;
		}else {
			if(num % 2 == 0) {
				num /= 2;
			}else {
				num = (3 * num) + 1;
			}
			
			return 1 + sumHail(num);
		}
		 
	}
	
}