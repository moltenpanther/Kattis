import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] block = new int[num];
		int count = 1;
		
		for(int i = 0; i < num; i++) {
			
			block[i] = scan.nextInt();
		}
		
		for(int i = 1; i < num; i++) {
			
			if(block[i] <= block[i - 1]) {
				
			}else {
				count++;
			}
		}
		
		System.out.println(count);

		scan.close();
	}
}