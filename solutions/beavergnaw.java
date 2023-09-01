import java.util.HashSet;
import java.util.Scanner;

public class beavergnaw {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);   	
    	
    	double ans = -1;
    	while(ans != 0) {    		
	    	double D = scan.nextDouble();
	    	double V = scan.nextDouble();
	
	    	ans = Math.cbrt(((Math.PI * Math.pow(D, 3)) - (6 * V)) / Math.PI);
	    				    	
	    	// Output
	    	if(ans != 0) {
	    		System.out.println(ans);
	    	}
    	}
   		
        scan.close();
    }

}
