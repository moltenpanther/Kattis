import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String cipher = scan.next();
		String key = scan.next();
		int length = cipher.length();
		int cipNum = 0;
		int newNum = 0;
		
		for(int i = 0; i < length; i++) {
			
			cipNum = cipher.charAt(i);
			newNum = cipNum - (key.charAt(i) - 65);
			
			while(newNum < 65) {
				newNum += 26;
			}
			while(newNum > 90) {
				newNum -= 26;
			}
			
			System.out.print(Character.toString(newNum));
			key += Character.toString(newNum);
			
		}
				
		scan.close();

	}

}