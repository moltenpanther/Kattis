import java.util.Scanner;

public class dasblinkenlights {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int light1 = scan.nextInt();
		int light2 = scan.nextInt();
		int time = scan.nextInt();
		
		int count1 = 0;
		int count2 = 0;
		
		boolean on1 = false;
		boolean on2 = false;
		boolean match = false;
		for(int i = 1; i <= time; i++) {
			
			count1++;
			count2++;
			
			if(count1 == light1) {
				on1 = true;
				count1 = 0;
			}
			if(count2 == light2) {
				on2 = true;
				count2 = 0;
			}
			
			if(on1 && on2) {
				match = true;
			}
			
			on1 = false;
			on2 = false;
		}
		
		if(match) {
			System.out.println("yes");			
		}else {
			System.out.println("no");
		}
		
		scan.close();
	}
	
}