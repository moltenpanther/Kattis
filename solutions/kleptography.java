import java.util.Scanner;

public class kleptography {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int keyL = scan.nextInt();
		scan.nextInt();
		String decInp = scan.next();
		String codInp = scan.next();
		
		String decoded = "";
		String coded = "";
		
		for(int i = decInp.length() - 1; i >= 0; i--) {
			decoded += decInp.charAt(i);
		}
		for(int i = codInp.length() - 1; i >= 0; i--) {
			coded += codInp.charAt(i);
		}
						
		for(int i = 0; i < coded.length(); i++) {
			
			char codedCh = coded.charAt(i);
			char decodedCh = decoded.charAt(i);
			
			int numChar = codedCh - decodedCh + 97;	
			if(numChar < 97) {
				numChar += 26;
			}
			
			decoded += (char)numChar;			
		}
			
		for(int i = decoded.length() - keyL - 1; i >= 0; i--) {
			System.out.print(decoded.charAt(i));
		}
		
		scan.close();
	}
	
}