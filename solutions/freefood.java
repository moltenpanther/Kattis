import java.math.BigInteger;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] start = new int[num]; 
		int[] stop = new int[num]; 		
		int dif = 0;
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			
			start[i] = scan.nextInt();
			stop[i] = scan.nextInt();
			
			dif += stop[i] - start[i] + 1;
		}
		
		int[] days = new int[dif];
		int k = 0;
		
		for(int i = 0; i < num; i++) {
			
			for(int j = start[i]; j <= stop[i]; j++) {

				
				days[k] = j;
				k++;
			}		
		}
		
		for(int i = 0; i < days.length; i++) {
			
			for(int j = i + 1; j < days.length; j++) {
				
				if(days[i] == days[j]) {
					j = days.length;
					count++;
				}
			}
		}
		
		System.out.println(days.length - count);
		
		scan.close();
	}
}