import java.util.Scanner;

public class mathhomework {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int b = scan.nextInt();
    	int c = scan.nextInt();
    	int d = scan.nextInt();
    	int goal = scan.nextInt();
    	
    	boolean poss = false;
    	for(int i = 0; i <= goal / b; i++) {
    		for(int j = 0; j <= goal / c; j++) {
    			for(int k = 0; k <= goal / d; k++) {
    	    		if(b * i + c * j + d * k == goal) {
    	    			poss = true;
    	    			System.out.println(i + " " + j + " " + k);
    	    		}
    	    	}
        	}
    	}
    	
    	if(!poss) {
    		System.out.println("impossible");
    	}
    	
    	scan.close();
    	
    }



}
