import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < num; i++) {
        	
        	String street = scan.nextLine();
        	int[] digits = new int[10];
        	
        	String numAdds = scan.nextLine();
        	int adds = Integer.parseInt(numAdds.substring(0, numAdds.indexOf(" ")));
        	while(adds > 0) {
        		
        		String[] nums = scan.nextLine().split(" ");
        		if(nums.length > 1) {        			
	        		int first = Integer.parseInt(nums[1]);
	        		int last = Integer.parseInt(nums[2]);
	        		int interval = Integer.parseInt(nums[3]);
	        		
	        		for(int k = first; k <= last; k += interval) {
	        			digits = countNums(k + "", digits);
	        		}
	        		
	        		adds -= ((last - first) / interval) + 1;
        		}else {
        			digits = countNums(nums[0], digits);
        		    adds--;
        		}	
        	}
        	
        	// Printing the Output
        	System.out.println(street);
        	System.out.println(numAdds);
        	
        	int sum = 0;
        	for(int j = 0; j < digits.length; j++) {
        		sum += digits[j];
        		System.out.println("Make " + digits[j] + " digit " + j);
        	}
        	
        	if(sum == 1) {
        		System.out.println("In total " + sum + " digit");        		
        	}else {
        		System.out.println("In total " + sum + " digits");        		
        	}
        }
        
        scan.close();
    }
    
    
    public static int[] countNums(String add, int[] digits) {
    	
    	for(int i = 0; i < add.length(); i++) {
    		int num = Integer.parseInt(String.valueOf(add.charAt(i)));
    		digits[num]++;
    	}
    	
    	return digits;	
    }
    
	
}
