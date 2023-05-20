import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		
		int count = 0;
		boolean eye = false;
		boolean correct = false;
		
		for(int i = 0; i < input.length(); i++) {

			int check = input.charAt(i);
			
			if(!eye) {

				if(check == '|') {
					count++;
				}else if(check == '(') {
					if(input.charAt(i + 1) == ')') {
						eye = true;
						i++;
					}else {
						i = input.length();
					}
				}
			}else {
				if(check == '|') {
					count--;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("correct");
		}else {
			System.out.println("fix");
		}
		
		scan.close();
	}
	
}