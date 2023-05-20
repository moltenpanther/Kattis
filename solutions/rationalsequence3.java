import java.util.Scanner;

public class rationalsequence3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i = 0; i < num; i++) {
            
        	String dir = "";
        	scan.next();
        	int inp = scan.nextInt();
        	
            while(inp > 1) {   
            	
	        	if(inp % 2 == 0) {
	        		inp /= 2;
	        		dir += "L";
	        	}else {
	        		inp--;
	        		inp /= 2;
	        		dir += "R";
	        	}
            }
        	
            int p = 1;
            int q = 1;
                        
        	for(int j = dir.length() - 1; j >= 0; j--) {
        		
        		if(dir.charAt(j) == 'L') {
        			q += p;
        		}else {
        			p += q;
        		}
        		
        	}
            
        	System.out.println((i + 1) + " " + p + "/" + q);
            
        }
        
        scan.close();
    }
    
}