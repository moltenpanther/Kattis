import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arithmeticdecoding {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    	int length = Integer.parseInt(br.readLine());
    	double d = Integer.parseInt(br.readLine());
    	String message = br.readLine();	
    	
    	double k = 0;
    	double half = .5;
    	for(int i = 2; i < message.length(); i++) {
    		
    		if(message.charAt(i) == '1') {
    			k += half;
    		}
    		
    		half /= 2;
    	}
    	
    	double probA = d / 8;
    	double probB = 1 - probA;
    	    	
    	double a = 0;
    	double b = 1;
    	
    	String ans = "";
    	for(int i = 0; i < length; i++) {
    		double c = a + probA * (b - a);
    		if(k < c) {
    			ans += "A";
    			b = c;
    		}else {
    			ans += "B";
    			a = c;
    		}	
    	}
    	
    	// Output
    	System.out.println(ans);
    	
    	br.close();
    }

}
