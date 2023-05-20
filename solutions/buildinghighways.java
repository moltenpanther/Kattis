import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	long num = scan.nextLong();
    	
    	long sum = 0;
    	long min = Integer.MAX_VALUE;
    	
    	for(int i = 0; i < num; i++) {
    		
    		long city = scan.nextLong();
    		if(city < min) {
    			min = city;
    		}
    		
    		sum += city;
    	}
    	
    	long mod = min * (num - 2);
    	
		/*
		 * System.out.println(sum); System.out.println("\t" + min + " * " + (num - 2));
		 * System.out.println("\t= " + mod);
		 */
    	
    	sum += mod;
    	
    	System.out.println(sum);
    		
    	scan.close();
    	
    }

}
