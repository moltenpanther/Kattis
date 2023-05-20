import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int vol = 7;
		int num = Integer.valueOf(scan.next());
		for(int i = 0; i < num; i++) {
			
			scan.next();
			String word = scan.next();
			if(word.equals("op!") && vol < 10) {
				vol++;
			}else if(word.equals("ned!") && vol > 0) {
				vol--;
			}
		}
		
		System.out.println(vol);
		
		scan.close();
	}
}