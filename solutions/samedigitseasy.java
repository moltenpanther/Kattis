import java.util.Scanner;

public class samedigitseasy {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int start = scan.nextInt();
    	int end = scan.nextInt();
    	
    	StringBuilder sb = new StringBuilder();
    	
    	int count = 0;
    	for(int i = start; i <= end; i++) {
    		
    		for(int j = i; j <= end; j++) {
    			
    			String multi = (i * j) + "";
    			String ij = (i + "" + j);
    			
    			// Count digits
    			int[] num = new int[10];
    			if(multi.length() == ij.length()) {
    				
    				for(int k = 0; k < multi.length(); k++) {
    					
    					int digit = Integer.parseInt(multi.substring(k, k + 1));
    					num[digit]++;
    					
    					digit = Integer.parseInt(ij.substring(k, k + 1));
    					num[digit]--;
    				}
    				
    				// Checking the num
    				boolean good = true;
    				for(int k = 0; k < 10; k++) {
    					if(num[k] != 0) {
    						good = false;
    					}
    				}
    				
    				if(good) {
    					sb.append("x = " + i+ ", y = " + j + ", xy = " + multi + "\n");
    					count++;
    				}
    			}
    		}
    	}
    	
    	// Output
    	System.out.println(count + " digit-preserving pair(s)");
    	System.out.println(sb.toString());
   		
    	scan.close();
    }

}
