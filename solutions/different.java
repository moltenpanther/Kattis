import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {
    	
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			long num1 = scan.nextLong();
			long num2 = scan.nextLong();
			
			long diff = Math.abs(num1 - num2);
			System.out.println(diff);
		}
		
		scan.close();
	}
	
}