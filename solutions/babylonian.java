import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int num = Integer.parseInt(scan.nextLine());
    	for(int i = 0; i < num; i++) {
    		String[] nums = parseLine(scan.nextLine()).split(",");
    		for(int j = 0; j < nums.length; j++) {
    		}
    		System.out.println(toSixty(nums));
    		
    	}
	}
	
	public static String parseLine(String line) {
		
		String ans = "";
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) != ',') {
				ans += line.charAt(i);
			}else {
				ans += ",0";
			}
		}
		return ans;
	}
	
	public static long toSixty(String[] nums) {
		
		long num = 0;
		int j = nums.length - 1;
		for(int i = 0; i < nums.length; i++) {
			num += Integer.parseInt(nums[i]) * Math.pow(60, j);
			j--;
		}
		return num;
	}

}