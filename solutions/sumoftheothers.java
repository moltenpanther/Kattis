import java.util.Scanner;

public class Kattis {
		
	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	while(scan.hasNext()) {
    		
    		String[] nums = scan.nextLine().split(" ");
    		
    		int ans = findSum(nums);
    		System.out.println(ans);
    	}
	}
    	
    	public static int findSum(String[] nums) {
    		
    		int num = 0;
    		for(int i = 0; i < nums.length; i++) {
    			int sum = 0;
    			int ans = Integer.parseInt(nums[i]);
    			for(int j = 0; j < nums.length; j++) {
    				num = Integer.parseInt(nums[j]);    			
    				if(j != i) {
    					sum += num;
    				}
    			}
    			if(sum == ans) {
    				return ans;
    			}
    		}    		
    		return 0;
    	}
    	
}
