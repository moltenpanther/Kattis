import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int cog = scan.nextInt();
		
		for(int i = 1; i < count; i++) {
			
			int num = scan.nextInt();
			int gcd = gcd(cog, num);
			
			System.out.println(cog / gcd + "/" + num / gcd);
			
		}
		
		
			
		scan.close();
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a % b);
		}
	}
	
}