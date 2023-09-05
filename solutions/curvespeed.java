import java.util.Scanner;

public class curvespeed {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);

    	while(scan.hasNext()) {
    		double r = scan.nextDouble();
    		double s = scan.nextDouble();
    		double velocity = Math.sqrt(r * (s + .16) / .067);
    		
    		System.out.println(Math.round(velocity));
    	}
    	
    	scan.close();
    }
    
}
