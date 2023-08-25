import java.util.Scanner;

public class growlinggears {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int num = scan.nextInt();
    	for(int i = 0; i < num; i++) {
    		
    		double max = -1;
    		int gear = 0;
    		int gears = scan.nextInt();
    		
    		// Looping the Gears by Calculating x
    		// From the Derivative and then y
    		// From Original Formula
    		for(int j = 0; j < gears; j++) {
    			
    			double a = scan.nextInt();
    			double b = scan.nextInt();
    			double c = scan.nextInt();
    			
    			double x = b / (2 * a);
    			double y = (-a * x * x) + (b * x) + c;
    			
    			if(y > max) {
    				max = y;
    				gear = j + 1;
    			}
    		}
    		
    		System.out.println(gear);
    		
    	}
    	
    	scan.close();
    	
    }

}
