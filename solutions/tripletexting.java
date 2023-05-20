import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String gma = scan.next();
		int length = gma.length();

		String sub1 = gma.substring(0, length / 3);
		String sub2 = gma.substring(length / 3, length * 2 / 3);
		String sub3 = gma.substring(length * 2 / 3, length);
		
		if(sub1.equals(sub2) && sub1.equals(sub3)) {
			System.out.print(sub1);
		}else if(sub1.equals(sub2) || sub1.equals(sub3)) {
			System.out.print(sub1);
		}else {
			System.out.print(sub3);
		}
		
	}

}