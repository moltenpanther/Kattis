import java.util.Scanner;

public class sjecista {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int num = scan.nextInt();
		int ans = 1;
		
		// = num! / (4! * (num - 4)!)
		for(int i = 0; i < 4; i++) {
			
			if(num > 0) {
				ans *= num--;				
			}
		}
				
		System.out.println(ans / 24);
		
		scan.close();
	}
	
}
