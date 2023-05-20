import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = "";
		boolean possible = true;
		
		input = scan.next();
		
		for(int i = 0; i < input.length() - 1; i++) {
			for(int j = i + 1; j < input.length(); j++) {
				if(input.charAt(i) == input.charAt(j)) {
					possible = false;
				}
			}
		}
		
		if(possible) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}
}
