import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {
    	
		Scanner scan = new Scanner(System.in);
		
		String line = "";
		while(!(line = scan.nextLine()).equals("0")) {
		
			String[] numStr = line.split(" ");
			int[] nums = new int[numStr.length - 1];
			for(int i = 0; i < nums.length; i++) {
				nums[i] = Integer.valueOf(numStr[i + 1]);
			}
			
			int num = Integer.parseInt(numStr[0]);
			line = lengthen(scan.nextLine(), num);
			
			int len = line.length() / num;
			System.out.print("'");		
			for(int i = 0; i < len; i++) {
				line = reorder(line, nums);
			}
			System.out.println("'");
		}
		
		scan.close();
	}
	
	public static String lengthen(String line, int num) {

		int rem = line.length() % num;
		if(rem != 0) {
			for(int i = 0; i < num - rem; i++) {
				line += " ";
			}
		}
		return line;
	}
	
	public static String reorder(String line, int[] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(line.charAt(nums[i] - 1));
		}
		line = line.substring(nums.length);
		return line;
	}
	
}