import java.util.Scanner;

public class armcoordination {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		System.out.println((x - r) + " " + (y + r));
		System.out.println((x + r) + " " + (y + r));
		System.out.println((x + r) + " " + (y - r));
		System.out.println((x - r) + " " + (y - r));
		
		scan.close();		
	}
	
}
