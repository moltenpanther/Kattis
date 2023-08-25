import java.util.Scanner;

public class utf8 {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int[] types = new int[5];
    	String sub = "";

    	boolean invalid = false;
    	int num = scan.nextInt();
    	for(int i = 0; i < num; i++) {
    		
    		String seq = scan.next();
    		int left = num - i - 1;

    		if(seq.substring(0, 1).equals("0")) {
    			types[1]++;
    		}else if(seq.substring(0, 3).equals("110") && left > 0) {
    			
    			seq = scan.next();
    			sub = seq.substring(0, 2);
    			if(!sub.equals("10")) {
    				invalid = true;    				
    			}
    			i++;
    			types[2]++;
    			
    		}else if(seq.substring(0, 4).equals("1110") && left > 1) {

    			for(int j = 0; j < 2 && !invalid; j++) {
        			seq = scan.next();
        			sub = seq.substring(0, 2);
        			if(!sub.equals("10")) {
        				invalid = true;    				
        			}	
    			}
    			i += 2;
    			types[3]++;
    			
    		}else if(seq.substring(0, 5).equals("11110") && left > 2) {
    			
    			for(int j = 0; j < 3 && !invalid; j++) {
        			seq = scan.next();
        			sub = seq.substring(0, 2);
        			if(!sub.equals("10")) {
        				invalid = true;    				
        			}	
    			}
    			i += 3;
    			types[4]++;
    			
    		}else {
    			invalid = true;
    		}
    		
    		if(invalid) {
    			i = num;
    			System.out.println("invalid");
    		}
    		
    	}
    	
		if(!invalid) {
			for(int i = 1; i < types.length; i++) {
				System.out.println(types[i]);				
			}
		}
   	
    	scan.close();
    	
    }

}
