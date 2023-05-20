import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		String guess = scan.next();
		int unique = word.length();
		int hangman = 0;
		int count = 0;
		boolean win = false;
		
		//Unique Letter Count
		for(int i = 0; i < word.length() - 1; i++) {
			
			for(int j = i + 1; j < word.length(); j++) {
				
				if(word.charAt(i) == word.charAt(j)) {
					unique--;
					j = word.length();
				}
			}
		}
		
		//Letter Check
		for(int i = 0; i < guess.length(); i++) {
					
			if(word.contains(String.valueOf(guess.charAt(i)))){
				count++;
				if(count == unique) {
					i = guess.length();
					win = true;
				}
			}else {
				hangman++;
				if(hangman == 10) {
					i = guess.length();
					win = false;
				}
			}
		}			

		if(win) {
			System.out.println("WIN");
		}else {
			System.out.println("LOSE");
		}
		
		scan.close();
	}

}