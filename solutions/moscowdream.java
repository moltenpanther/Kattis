import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[4];
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			nums[i] = scan.nextInt();
			if(i < 3) {
				sum += nums[i];
			}
		}
		
		if(nums[0] > 0 && nums[1] > 0 && nums[2] > 0 && sum >= nums[3] && nums[3] >= 3) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		scan.close();
	}	
	
}	