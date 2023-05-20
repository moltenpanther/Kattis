import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean end = false;
		
		while(end == false) {
		
			int sweet = scan.nextInt();
			int sour = scan.nextInt();
			
			if(sweet == 0 && sour == 0) {
				end = true;
			}else {
			
				if(sweet + sour == 13) {
					System.out.println("Never speak again.");
				}else if(sweet > sour) {
					System.out.println("To the convention.");
				}else if(sour > sweet) {
					System.out.println("Left beehind.");
				}else {
					System.out.println("Undecided.");
				}
				
			}
			
		}
		
		scan.close();
		
	}

}