import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String x1 = scan.next();
		String y1 = scan.next();
		
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < x1.length(); i++) {
			if(x1.charAt(i) == 'S') {
				x++;				
			}
		}
		
		for(int i = 0; i < y1.length(); i++) {
			if(y1.charAt(i) == 'S') {
				y++;				
			}
		}
		
		int tot = x * y;
		
		for(int i = 0; i < tot; i++) {
			System.out.print("S(");
		}
		System.out.print("0");
		for(int i = 0; i < tot; i++) {
			System.out.print(")");
		}
		
		scan.close();
	}
	
}