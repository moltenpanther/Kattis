import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int rooms = scan.nextInt();
		int teams = scan.nextInt();
		
		int div = teams / rooms;
		int rem = teams % rooms;
		
		for(int i = 0; i < rooms; i++) {

			for(int j = 0; j < div; j++) {
				
				System.out.print("*");
			}
			if(rem > 0) {
				System.out.print("*");
				rem--;
			}
			System.out.println();
		}
		
		scan.close();
	}
	
}