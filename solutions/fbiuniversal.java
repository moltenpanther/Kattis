import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	int num = Integer.parseInt(scan.next());
    	for(int i = 0; i < num; i++) {
    		
    		scan.next();
    		String input = scan.next();
    		
    		input = correctInput(input);
    		int[] nums = toNums(input);
    		int total = checkDigit(nums);
    		
    		System.out.print((i + 1) + " ");
    		if(total == nums[8]) {
    			System.out.print(toDec(nums));
    		}else {
    			System.out.print("Invalid");
    		}
    		System.out.println();
    	}
    	
    	scan.close();
	}
	
	public static String correctInput(String input) {
		
		String ans = "";
		for(int i = 0; i < input.length(); i++) {	
			if(input.charAt(i) == 'B') {
				ans += '8';
			}else if(input.charAt(i) == 'G') {
				ans += 'C';
			}else if(input.charAt(i) == 'I') {
				ans += '1';
			}else if(input.charAt(i) == 'O' || input.charAt(i) == 'Q') {
				ans += '0';
			}else if(input.charAt(i) == 'S') {
				ans += '5';
			}else if(input.charAt(i) == 'U' || input.charAt(i) == 'Y') {
				ans += 'V';
			}else if(input.charAt(i) == 'Z') {
				ans += '2';
			}else {
				ans += input.charAt(i);
			}
		}
		return ans;
	}

	public static int[] toNums(String input) {
		
		String base = "0123456789ACDEFHJKLMNPRTVWX";
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
		
		int[] ans = new int[input.length()];
		
		for(int i = 0; i < input.length(); i++){
				ans[i] = nums[base.indexOf(input.charAt(i))];					
		}		
		return ans;
	}
	
	public static int checkDigit(int[] nums) {
		
		int ans = (2 * nums[0] + 4 * nums[1] + 5 * nums[2] + 7 * nums[3] + 8 * nums[4] + 10 * nums[5] + 11 * nums[6] + 13 * nums[7]) % 27;
		return ans;
	}

	public static long toDec(int[] nums) {
		
		int j = 0;
		long sum = 0;
		for(int i = nums.length - 2; i >= 0; i--) {
			
			sum += nums[i] * Math.pow(27, j);
			j++;
		}
		return sum;
	}
}