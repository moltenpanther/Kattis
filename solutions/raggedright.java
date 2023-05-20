import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        int max = Integer.MIN_VALUE;
        while(scan.hasNext()) {
        	
        	String line = scan.nextLine();
        	
        	int len = line.length();
        	nums.add(len);
        	
        	if(len > max) {
        		max = len;
        	}
        	
        }
        
        int sum = 0;
        for(int i = 0; i < nums.size() - 1; i++) {
        	sum += Math.pow(nums.get(i) - max, 2);
        }
        
        System.out.println(sum);
                
        scan.close();
    }
    
}
