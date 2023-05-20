import java.util.HashMap;
import java.util.Scanner;

public class popularitycontest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		
		int[] friends = new int[num + 1];
		
		for(int i = 0; i < num2; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			friends[x]++;
			friends[y]++;
		}
				
		for(int i = 1; i < num + 1; i++) {
			
			int pop = friends[i];
			
			System.out.println(pop - i);
		}
		
		scan.close();
	}
	
}
