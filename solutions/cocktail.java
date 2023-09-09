import java.util.Arrays;
import java.util.Scanner;

public class cocktail {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	    	
    	int num = scan.nextInt();
    	int[] times = new int[num];
    	int timeToDrink = scan.nextInt();
    	for(int i = 0; i < num; i++) {
    		int time = scan.nextInt();
    		times[i] = time;
    	}
    	
    	Arrays.sort(times);
    	
    	boolean possible = true;
    	
    	for(int i = num - 1; i >= 0; i--) {
        	int check = (timeToDrink * (i));
        	if(check >= times[i]) {
    			possible = false;
    			i = -1;
    		}
    	}
    	
    	
    	// Output
    	if(possible) {
    		System.out.println("YES");
    	}else {
    		System.out.println("NO");    		
    	}
   		
    	scan.close();
    }

}
