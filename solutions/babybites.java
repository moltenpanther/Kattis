import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		boolean check = true;
		for(int i = 1; i <= num; i++) {
			
			String word = scan.next();
			
			if(word.equals(String.valueOf(i)) || word.equals("mumble")) {
				
			}else {
				check = false;
				i = num;
			}
		}
		
		if(check) {
			System.out.println("makes sense");
		}else {
			System.out.println("something is fishy");
		}
		
		scan.close();
	}
}