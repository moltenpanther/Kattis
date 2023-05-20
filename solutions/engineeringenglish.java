import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
				
		ArrayList<String> words = new ArrayList<>();
		
		while(scan.hasNext()) {
			String word = scan.next();
			if(words.contains(word.toLowerCase())) {
				System.out.print(". ");
			}else {
				words.add(word.toLowerCase());
				System.out.print(word + " ");
			}
		}
	}
	
}
