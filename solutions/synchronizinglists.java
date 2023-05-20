import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		while(num != 0) {
			int[] x = new int[num];
			int[] y = new int[num];
			int[] xOrder = new int[num];
			int[] ans = new int[num];
			//Input
			for(int i = 0; i < num; i++) {
				x[i] = scan.nextInt();
				xOrder[i] = x[i];
			}
			for(int i = 0; i < num; i++) {
				y[i] = scan.nextInt();
			}
			//Finding Order
			Arrays.sort(x);;
			Arrays.sort(y);
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < num; j++) {
					if(xOrder[j] == x[i]) {
						ans[j] = y[i];
					}
				}
			}
			//Print
			for(int i = 0; i < num; i++) {
				System.out.println(ans[i]);
			}	
			num = scan.nextInt();
			if(num != 0) {
				System.out.println();
			}
		}
		scan.close();
	}
}