import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double num = scan.nextDouble();
		System.out.println(Math.pow(num, 1/num));
		
		scan.close();
	}
}