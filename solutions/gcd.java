import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	
    	int numBig = a;
    	int numSmall = b;
    	
    	if(a < b) {
    		numBig = b;
    		numSmall = a;
    	}
    	
    	for(int i = numSmall; i >= 1; i--) {
    		
    		if(numSmall % i == 0 && numBig % i == 0) {
    			System.out.println(i);
    			i = -1;
    		}
    		
    	}
    		
    	scan.close();
    	
    }

}
