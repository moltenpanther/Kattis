import java.util.Scanner;

public class contingencyplanning {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        if(num < 12) {
        	
	        int sum = 0;
	        int permTop = getFactorial(num);
	        for(int i = 0; i < num; i++) {
	        	
	        	int permBottom = getFactorial(i);
	            int perm = permTop / permBottom;
	        	sum += perm;
	        	
	        }
	        
	        System.out.println(sum);
	        
        }else {
        	System.out.println("JUST RUN!!");
        }
        
        scan.close();
    }

	public static int getFactorial(int num) {
    	
		int factorial = 1;
		for(int i = 1; i <= num; i++) {
    		factorial *= i;
    	}
		
		return factorial;
	}
}
