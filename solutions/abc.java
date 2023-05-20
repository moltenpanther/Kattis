import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[3];
		String[] abcs = new String[3];
		
		for(int i = 0; i < 3; i++) {
			nums[i] = scan.nextInt();			
		}
		String letters = scan.next();
		
		for(int i = 0; i < 3; i++) {
			abcs[i] = String.valueOf(letters.charAt(i));			
		}

		Arrays.sort(nums);
		
		int[] ans = new int[3];
		for(int i = 0; i < 3; i++) {
			if(abcs[i].equals("A")) {
				ans[i] = nums[0];
			}else if(abcs[i].equals("B")) {
				ans[i] = nums[1];
			}else if(abcs[i].equals("C")) {
				ans[i] = nums[2];
			}
		}
		
		System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
		scan.close();
	}
}