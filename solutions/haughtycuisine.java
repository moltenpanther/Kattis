import java.util.Scanner;

public class haughtycuisine {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		scan.nextInt();
		
		int itemNum = scan.nextInt();
		System.out.println(itemNum);
		for(int i = 0; i < itemNum; i++) {		
			System.out.println(scan.next());
		}
		
		scan.close();
	}
	
}