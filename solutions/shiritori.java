import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Kattis {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HashSet<String> wordList = new HashSet<String>();
		Stack<String> words = new Stack<String>();
				
		boolean lose = false;
		boolean player = true;
		
		int num = scan.nextInt();
		
		String word = scan.next(); 
		words.push(word);
		wordList.add(word);
		
		for(int i = 1; i < num; i++) {
			
			if(player) {
				player = false;
			}else {
				player = true;
			}
			
			String prev = words.peek();
			word = scan.next();
			words.push(word);	
			
			if(word.charAt(0) != prev.charAt(prev.length() - 1) || wordList.contains(word)) {
				lose = true;
				i = num;
			}
			
			wordList.add(word);
		}
		
		if(!lose) {
			System.out.println("Fair Game");
		}else {
			if(player) {
				System.out.println("Player 1 lost");
			}else {
				System.out.println("Player 2 lost");
			}
		}
		
		scan.close();
	}
	
}
