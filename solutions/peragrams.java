import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] count = new int[26];
		
		String input = scan.next();
		
		for(int i = 0; i < input.length(); i++) {
			
			count[input.charAt(i) - 97]++;
		}
		
		int odds = 0;
		for(int i = 0; i < count.length; i++) {
			
			if(count[i] % 2 != 0) {
				odds++;
			}
		}
		
		if(odds < 2) {
			System.out.println(0);
		}else {
			System.out.println(odds - 1);
		}
		
		scan.close();
	}
}