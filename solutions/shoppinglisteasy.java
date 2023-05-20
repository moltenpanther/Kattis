import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Setting up Arrays
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		String[][] lists = new String[num1][num2];
		for(int i = 0; i < num1; i++) {
			for(int j = 0; j < num2; j++) {
				lists[i][j] = scan.next();
			}
		}
		//Counting What Items are on All Lists
		int[] count = new int[num2];
		for(int i = 0; i < num2; i++) {
			for(int j = 1; j < num1; j++) {
				for(int k = 0; k < num2; k++) {
					if(lists[j][k].equals(lists[0][i])) {
						count[i]++;
					}
				}
			}
		}
		
		//Checking How Many Max There Are
		int maxCount = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[i] == num1 - 1) {
				maxCount++;
			}
		}
		
		//Filling Ans Array
		String[] ans = new String[maxCount];
		int ansCount = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[i] == num1 - 1) {
				ans[ansCount] = lists[0][i];
				ansCount++;
			}
		}
		
		Arrays.sort(ans);
		
		//Printing Output
		System.out.println(ans.length);
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
		
		scan.close();
	}
}