import java.util.Scanner;

public class simplefactoring {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int num = scan.nextInt();
    	for(int i = 0; i <= num; i++) {
	    	
    		int a = scan.nextInt();
    		int b = scan.nextInt();
    		int c = scan.nextInt();
    		
    		double check = Math.pow(b, 2) - (4 * a * c);
    		double root = Math.floor(Math.sqrt(check));

    		if(root * root == check) {
    			System.out.println("YES");
    		}else {
    			System.out.println("NO");
    		}
	    	
    	}
    	
    	// Output
    	System.out.println("");
   		
    	scan.close();
    }

}
