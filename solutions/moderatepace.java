import java.util.Arrays;
import java.util.Scanner;

public class moderatepace {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = Integer.parseInt(scan.nextLine());
		
		int[] p1 = new int[num];
		int[] p2 = new int[num];
		int[] p3 = new int[num];
		
		for(int i = 0; i < num; i++) {
			p1[i] = scan.nextInt();
		}
		for(int i = 0; i < num; i++) {
			p2[i] = scan.nextInt();
		}
		for(int i = 0; i < num; i++) {
			p3[i] = scan.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			int[] arr = {p1[i], p2[i], p3[i]};
			Arrays.sort(arr);
			
			System.out.print(arr[1] + " ");
		}
		
		scan.close();
	}
	
}