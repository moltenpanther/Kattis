import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kattis {
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		
		int num = scan.nextInt();
		String best = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i < num; i++) {
			
			String word = scan.next();
			if(word.length() > 4) {
				
				boolean repeated = checkRepeats(word);
				if(repeated) {
					
					if(word.length() < best.length()) {
						best = word;
						words = new ArrayList<String>();
						words.add(word);
					}else if(word.length() == best.length()) {
						words.add(word);
					}
				}
			}
		}
		
		if(words.size() == 0) {
			System.out.println("neibb!");
		}else {			
			String[] ansWords = new String[words.size()];
			for(int i = 0; i < words.size(); i++) {
				ansWords[i] = words.get(i);
			}
			
			Arrays.sort(ansWords);
			
			System.out.println(ansWords[ansWords.length - 1]);
		}
		
		scan.close();
	}
	
	public static boolean checkRepeats(String word) {
		
		char[] letters = word.toCharArray();
		Arrays.sort(letters);
		
		for(int i = 0; i < letters.length - 1; i++) {
			if(letters[i] == letters[i + 1]) {
				return false;
			}			
		}
		
		return true;
	}
	
}
