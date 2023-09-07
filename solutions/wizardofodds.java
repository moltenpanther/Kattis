import java.util.Scanner;

public class wizardofodds {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	double num = scan.nextDouble();
    	double guesses = scan.nextDouble();
    	
    	int ans = (int)Math.ceil(Math.log(num) / Math.log(2));
    	    	
    	if(guesses >= ans) {
    		System.out.println("Your wish is granted!");
    	}else {
    		System.out.println("You will become a flying monkey!");
    	}
    	
    	scan.close();
    	
	}
    
}
