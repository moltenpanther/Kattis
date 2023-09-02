import java.util.Scanner;

public class vajningsplikt {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	boolean yield = false;
    	
    	char start = scan.next().charAt(0);
    	char end = scan.next().charAt(0);
    	char enemy = scan.next().charAt(0);
    	
    	if(start == 'S') {
    		
    		if(end == 'N') {
    			if(enemy == 'E') {
    				yield = true;
    			}
    		}else if(end == 'W') {
    			if(enemy == 'N' || enemy == 'E') {
    				yield = true;
    			}
    		}
    		
    	}else if(start == 'E') {
    		
    		if(end == 'W') {
    			if(enemy == 'N') {
    				yield = true;
    			}
    		}else if(end == 'S') {
    			if(enemy == 'W' || enemy == 'N') {
    				yield = true;
    			}
    		}
    		
    	}else if(start == 'N') {
    		
    		if(end == 'S') {
    			if(enemy == 'W') {
    				yield = true;
    			}
    		}else if(end == 'E') {
    			if(enemy == 'W' || enemy == 'S') {
    				yield = true;
    			}
    		}
    		
    	}else if(start == 'W') {
    		
    		if(end == 'E') {
    			if(enemy == 'S') {
    				yield = true;
    			}
    		}else if(end == 'N') {
    			if(enemy == 'E' || enemy == 'S') {
    				yield = true;
    			}
    		}
    		
    	}
    	
    	// Output
    	if(yield) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
   		
    	scan.close();
    }

}
