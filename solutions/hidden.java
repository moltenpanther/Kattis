import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String key = scan.next();
		String phrase = scan.next();
		int j = 0;
		boolean check = false;
		for(int i = 0; i < phrase.length(); i++) {
			
			char phr = phrase.charAt(i);
			char kyj = key.charAt(j);
			
			if(phr == kyj) {
				j++;
				if(j == key.length()) {
					check = true;
					i = phrase.length();
				}
			}else if(key.substring(j + 1).contains(String.valueOf(phr))) {
				check = false;
				i = phrase.length();
			}
		}
		
		if(check) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
			
	}
	
}
