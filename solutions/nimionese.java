import java.util.Scanner;

public class Kattis {

	static String hard = "bcdgknptBCDGKNPT";

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		String ans = "";
		
		for(int i = 0; i < line.length; i++) {
			
			String word = line[i];
				
			word = checkStart(word);
			if(word.contains("-")) {
				word = checkMiddle(word);				
			}
			word = checkEnd(word);
				
			ans += word + " ";
		}
		System.out.println(ans);
		scan.close();
	}
	
	public static String checkStart(String word) {
		
		int i = 0;
		char check = word.charAt(0);
		while(!hard.contains(String.valueOf(check))){
			
			char let1 = (char)((int)check - i);
			char let2 = (char)((int)check + i);

			if((int) check < 91) {
				let1 = Character.toUpperCase(let1);
				let2 = Character.toUpperCase(let2);				
			}
			
			if(hard.contains(String.valueOf(let1))) {
				check = let1;
			}else if(hard.contains(String.valueOf(let2))) {
				check = let2;
			}else {
				i++;
			}
		}
		

		return check + word.substring(1);
	}
	
	public static String checkMiddle(String word) {
		
		String ans = word.substring(0, word.indexOf('-'));
		for(int i = word.indexOf('-'); i < word.length(); i++) {
			
			if(word.charAt(i) != '-') {
				if(hard.contains(String.valueOf(word.charAt(i)))) {
					ans += String.valueOf(word.charAt(0)).toLowerCase();
				}else {
					ans += word.charAt(i);
				}
			}
			
		}
		
		return ans;
	}
	
	public static String checkEnd(String word) {
		
		String end = "";
		char check = word.charAt(word.length() - 1);
		if(hard.contains(String.valueOf(check))) {
			
			if((int)check < (int)'o') {
				if((int)'o' - (int)check < (int)check - (int)'a') {
					end = "oh";
				}else {
					end = "ah";
				}
			}else {
				if((int)'u' - (int)check < (int)check - (int)'o') {
					end = "uh";
				}else {
					end = "oh";
				}
			}
		}
		return word + end;
	}
	
}
