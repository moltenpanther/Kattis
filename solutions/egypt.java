import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	String line = "";
    	while(!(line = scan.nextLine()).equals("0 0 0")) {
    		
    		String[] numStr = line.split(" ");
    		long[] nums = {Integer.parseInt(numStr[0]), Integer.parseInt(numStr[1]), Integer.parseInt(numStr[2])};
    		Arrays.sort(nums);
    		
    		if(Math.pow(nums[0], 2) + Math.pow(nums[1], 2) == Math.pow(nums[2], 2)) {
    			System.out.println("right");
    		}else {
    			System.out.println("wrong");
    		}		
    	}
    	
    	scan.close();
    }
}