import java.util.Scanner;

public class flipflow {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	// Setting up
    	int time = scan.nextInt();
    	int sand = scan.nextInt();
    	int flipNum = scan.nextInt();
    	
    	// Calculating
    	int top = 0;
    	int bottom = sand;
    	int lastTime = 0;
    	for(int i = 0; i < flipNum; i++) {
    			
    		int flipTime = scan.nextInt();
    		int dif = flipTime - lastTime;
    		lastTime = flipTime;
    		
    		if(top == 0) {
    			top = sand;
    			bottom = 0;
    		}else{
    			
    			top -= dif;
    			bottom += dif;
    			
    			if(top < 0) {
    				top = 0;
    				bottom = sand;
    			}
    			    			
    			int temp = top;
    			top = bottom;
    			bottom = temp;
    			

    		}
    		    		
    	}

      // Output
    	int dif = time - lastTime;
    	int ans = top - dif;

    	if(ans < 0) {
    		ans = 0;
    	}
    	
    	System.out.println(ans);
    	
    	scan.close();
    	
    }

}
