import java.util.Scanner;
import java.util.Stack;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);

    	int[] obstacles = new int[scan.nextInt()];
    	int found = scan.nextInt();
    	
    	for(int i = 0; i < obstacles.length; i++) {
    		obstacles[i] = i;
    	}
    	int count = 0;
    	for(int i = 0; i < found; i++) {
    		int num = scan.nextInt();
    		if(obstacles[num] > 100) {
    			count++;
    		}else {
    			obstacles[num] = 101;
    		}
    	}
    	
    	for(int i = 0; i < obstacles.length; i++) {
    		if(obstacles[i] <= 100) {
    			System.out.println(i);
    		}
    	}
    	int ans = found - count;
    	System.out.println("Mario got " + ans + " of the dangerous obstacles.");
    	
    	scan.close();
    }
}