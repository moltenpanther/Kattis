import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String num = scan.next();
		
		if(num.substring(0, 3).equals("555")) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		scan.close();
	}	
}