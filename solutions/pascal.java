import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kattis {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	
    	int ans = 0;
    	int sqrt = (int) Math.round(Math.sqrt(num));
    	    		
  	  	for(int i = 2; i <= sqrt; i++) {
	  	    if(num % i == 0) {
	  	    	ans = num - (num / i);
	  	    	break;
	  	    }
	  	}
  	  	
  	  	if(ans == 0) {
  	  		ans = num - 1;
  	  	}
    	
    	// Output    	
    	System.out.println(ans);
   		
    	br.close();
    }
    
    public static boolean checkPrime(int num) {
        
    	double sqrt = Math.sqrt(num);
    	for(int i = 2; i <= sqrt; i++) {
	    	if(num % i == 0) {
	    		return false;
	    	}
    	}
    	  
    	return true;
    }
}
