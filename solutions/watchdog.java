import java.util.HashSet;
import java.util.Scanner;

public class watchdog {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	int cases = scan.nextInt();
    	for(int i = 0; i < cases; i++) {
    		
    		int roof = scan.nextInt();
    		int hatches = scan.nextInt();
    		
    		int[] x = new int[hatches];
    		int[] y = new int[hatches];
    		HashSet<String> hash = new HashSet<String>();
    		
    		for(int j = 0; j < hatches; j++) {
    			x[j] = scan.nextInt();
    			y[j] = scan.nextInt();
    			hash.add(x[j] + "/" + y[j]);
    		}
    		
    		int dogX = 50;
    		int dogY = 50;
    		
    		boolean foundOne = false;
    		int rad = 1;
    		// Loop through grid
    		for(int j = 1; j <= roof / 2; j++) {
    			    			
    			// k = x/col
    			for(int k = rad; k <= roof - rad; k++) {
    				
    				if(k <= dogX) {
    					
	    				boolean allIn = false;
	
	    				// l = y/row
	    				for(int l = rad; l <= roof - rad; l++) {
	    					
	    					String hashCheck = k + "/" + l;
	    					
	    					if(!hash.contains(hashCheck)) {
	    						allIn = allWithinCircle(k, l, rad, x, y);
	    					}
	    					
	    					if(allIn) {
	    						foundOne = true;
	    						if(k < dogX) {
	    							dogX = k;
	    							dogY = l;
	    						}
	    						if(k == dogX) {
	    							if(l < dogY) {
	    								dogY = l;
	    							}
	    						}
	    					}
	    				}
    				}else {
    					k = roof;    					
    				}
    			}
    			rad++;
    		}
    		
    		// Output
    		if(foundOne) {
    			System.out.println(dogX + " " + dogY);
    		}else {
    			System.out.println("poodle");    			
    		}
    		
    	}
    	
        scan.close();
    }

	public static boolean allWithinCircle(int col, int row, int rad, int[] x, int[] y) {
		
		for(int i = 0; i < x.length; i++) {
			double dis = Math.sqrt(Math.pow(col - x[i], 2) + Math.pow(row - y[i], 2));
			if(dis > rad) {
				return false;
			}
		}	
		return true;
	}

}
