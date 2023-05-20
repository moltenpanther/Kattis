import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
		boolean running = true;
		while(running) {
			
			int num = scan.nextInt();
			
			if(num != 0) {
				
				String input = scan.next().toUpperCase();
				String rev = "";
				for(int i = input.length() - 1; i >= 0; i--) {
					rev += input.charAt(i);
				}
				
				String code = "";
				for(int i = 0; i < rev.length(); i++) {
					for(int j = 0; j < alpha.length(); j++) {
						if(rev.charAt(i) == alpha.charAt(j)) {						
							if(j + num < alpha.length()) {
								code += alpha.charAt(j + num);
							}else {
								code += alpha.charAt(0 + ((j + num) - alpha.length()));
							}
						}					
					}
				}
				System.out.println(code);
			
			}else {
				running = false;
			}
		}
		scan.close();
	}
}