import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int time = scan.nextInt();
		int sum = 0;
		int count = 0;
		for(int i = 0; i < num; i++) {
			sum += scan.nextInt();
			if(!(sum > time)) {
				count++;
			}
		}
		System.out.println(count);				
		scan.close();
	}
}	