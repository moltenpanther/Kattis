import java.util.Arrays;
import java.util.Scanner;

public class plantingtrees {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] treesF = new int[num];
		
		for(int i = 0; i < num; i++) {
			treesF[i] = scan.nextInt();
		}
		
		Arrays.sort(treesF);
		
		int[] trees = new int [num];
		
		for(int i = 0; i < num; i++) {
			trees[i] = treesF[num - i - 1];
		}
		
		int max = -1;
		for(int i = 0; i < num; i++) {
			int days = trees[i] + i;
			if(days > max) {
				max = days;
			}
		}
				
		System.out.println(max + 2);
		
		scan.close();
	}
	
}