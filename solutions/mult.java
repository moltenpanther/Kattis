import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] nums = new int[num];
		
		for(int i = 0; i < num; i++) {
			nums[i] = scan.nextInt();
		}
		
		int init = nums[0];
		
		for(int i = 1; i < num; i++) {
			
			if(nums[i] % init == 0) {
				System.out.println(nums[i++]);
				init = nums[i];
			}
		}
		
		scan.close();
	}
	
}