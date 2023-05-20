import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num % 2 != 0) {
			System.out.println("still running");
		}else {
			
			int[] click = new int[num];
			for(int i = 0; i < num; i++) {
				click[i] = scan.nextInt();
			}
			
			int sum = 0;
			for(int i = 0; i < num; i += 2) {
				sum += click[i + 1] - click[i];
			}
			System.out.println(sum);
		}
		scan.close();
	}	
}	