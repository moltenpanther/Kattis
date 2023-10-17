import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class ninetynine {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int total = 1;
    	boolean three = false;
    	
    	System.out.println(1);
    	
    	boolean good = false;
    	while(!good) {
    		
	    	int opp = Integer.parseInt(br.readLine());
	    			
	    	int myNum = 1;
	    	if(three) {
	    		if(opp - total == 1) {
	    			myNum = 2;
	    		}
	    	}else {
	    		
	    		if(opp - total == 2) {
	    			myNum = 2;
	    		}
	    		
	    	}
	    	
	    	opp += myNum;
	    	total = opp;
	    	
	    	if(total % 3 == 0) {
	    		three = true;
	    	}
	    		    	
	    	// Output
	    	if(total == 99) {
	    		System.out.println(99);
	    		System.exit(0);
	    	}else {
	    		System.out.println(total);	    		
	    	}
    	}
   		
    	br.close();
    }

}
