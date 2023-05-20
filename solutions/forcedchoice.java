import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numOfCards = scan.nextInt();
		String chosen = scan.next();
		int steps = scan.nextInt();
		
		for(int i = 0; i < steps; i++) {
			
			int cards = scan.nextInt();
			String cardList = " ";
			
			for(int j = 0; j < cards; j++) {
				cardList += scan.next() + " ";
			}
			if(cardList.contains(" " + chosen + " ")) {
				System.out.println("KEEP");
			}else {
				System.out.println("REMOVE");
			}
		}
		scan.close();
	}	
}	