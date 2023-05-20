import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String[] keys = {" ", "!", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        int num = Integer.valueOf(scan.nextLine());
        
        for(int i = 0; i < num; i++) {
        
	        String text = scan.nextLine();
	    	int length = text.length();
			int oldK = 999;
			System.out.print("Case #" + (i + 1) + ": ");
			
	    	//Char checker
	    	for(int j = 0; j < length; j++) {
	    		
	    		char bit = text.charAt(j);
	    		
	    		//Scan through array
	    		for(int k = 0; k < keys.length; k++) {
	    			
	    			if(keys[k].contains(String.valueOf(bit))) {
	    				
	    				if(k == oldK) {
	    					System.out.print(" ");
	    				}
	    				
	    				int kLength = keys[k].length();
	    				
	    				//Scan through key
	    				for(int l = 0; l < kLength; l++) {
	    					
	    					if(keys[k].charAt(l) != bit) {
	        					System.out.print(k);
	    					}else {
	        					System.out.print(k);
	        					l = kLength;
	    					}
	    				}
	    				
	    				oldK = k;	
	
	    			}
	    		}
	        }
	    	
	    	System.out.println();
        }
    	
        scan.close();
        
    }

}