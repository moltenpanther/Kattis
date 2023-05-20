import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next() + "   ";
		
		for(int i = 0; i < input.length() - 3; i++) {
			
			String sub1 = input.substring(i, i + 2);
			String sub2 = input.substring(i, i + 3);
			
			if(sub1.equals(":)") || sub1.equals(";)") || sub2.equals(":-)") || sub2.equals(";-)")) {
				System.out.println(i);
			}	
		}
	}
}
