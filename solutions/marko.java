import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String[] words = new String[num];
		String[] t9 = {null, null, "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

		for(int i = 0; i < num; i++) {
			words[i] = scan.next();
		}
		
		String typed = scan.next();
		int count = 0;
		for(int i = 0; i < num; i++) {
			String keys = "";
			for(int j = 0; j < words[i].length(); j++) {
				for(int k = 2; k < t9.length; k++) {
					if(t9[k].contains(String.valueOf(words[i].charAt(j)))) {
						keys += String.valueOf(k);
					}
				}
			}
			if(keys.equals(typed)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		scan.close();
	}	
	
}	