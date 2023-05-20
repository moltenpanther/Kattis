import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 1;
		
		for(int i = 0; i < num; i++) {
			sum += scan.nextInt() - 1;
		}
		
		System.out.println(sum);
		
		scan.close();
	}
}