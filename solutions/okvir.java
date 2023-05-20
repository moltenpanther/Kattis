import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int wordN = Integer.parseInt(scan.next());
    	int wordL = Integer.parseInt(scan.next());
    	
    	int up = Integer.parseInt(scan.next());
    	int left = Integer.parseInt(scan.next());
    	int right = Integer.parseInt(scan.next());
    	int down = Integer.parseInt(scan.next());
    	
    	int height = wordN + up + down;
    	int width = wordL + left + right;
    	
    	boolean hash = true;
    	for(int i = 0; i < height; i++) {
	    
    		for(int j = 0; j < width; j++) {
	    			
	    		if(i < up || i >= wordN + up) {
	    			if(hash) {
	    				System.out.print("#");
	    				hash = false;
	    			}else {
	    				System.out.print(".");
	    				hash = true;
	    			}
	    		}else {
	    			if(j < left || j >= wordL + left) {
	    				if(hash) {
	    					System.out.print("#");
	    					hash = false;
	    				}else {
	    					System.out.print(".");
	    					hash = true;
	    				}	    				
	    			}else {
	    				System.out.print(scan.next());
	    				j += wordL - 1;
	    				if(wordL % 2 != 0) {
	    					if(hash) {
	    						hash = false;
	    					}else {
	    						hash = true;
	    					}
	    				}
	    			}
	    		}	
    		}
    		
			if(i % 2 == 0) {
				hash = false;
			}else {
				hash = true;
			}
	    	System.out.println();
    	}
    	scan.close();
	}
}