import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Hashtable;

public class incognito {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	// Reading in and counting the disguise types
    	String[] line = br.readLine().split(" ");
    	int num = Integer.parseInt(line[0]);
    	for(int i = 0; i < num; i++) {
    		
    		Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
    		
    		line = br.readLine().split(" ");
    		int attr = Integer.parseInt(line[0]);
    		for(int j = 0; j < attr; j++) {
    			
    			line = br.readLine().split(" ");
    			String type = line[1];
    			
    			hash.putIfAbsent(type, 1);
    			hash.computeIfPresent(type, (key, val) -> val += 1);
    		}
    		
    		int prod = 1;
    		for(int type : hash.values()) {
    			prod *= type;
    		}
    		
    		prod--;
    		
    		// Output
    		System.out.println(prod);
    		
    	}
    	
    	br.close();
    }
    
    public BigInteger getCombination(int n, int r){
    	
    	BigInteger combo = BigInteger.ONE;
    	
    	BigInteger top = getFact(n);
    	BigInteger bottom = getFact(n - r).multiply(getFact(r));
    	
    	combo = top.divide(bottom);
    	
    	return combo;
    }
    
    // Calculates Factorial
    public BigInteger getFact(int num) {
    	
    	BigInteger fact = BigInteger.ONE;
    	
    	for(int i = 1; i <= num; i++) {
    		fact = fact.multiply(BigInteger.valueOf(i));
    	}
    	
    	return fact;
    	
    }
    
}
