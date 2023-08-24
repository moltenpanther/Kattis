import java.util.Hashtable;
import java.util.Scanner;

public class pakethanterare {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	// Setting Up
    	int numTypes = Integer.valueOf(scan.next());
    	int numStores = Integer.valueOf(scan.next());
    	
    	int[] typesPerStore = new int[numStores];
    	for(int i = 0; i < numStores; i++) {
    		typesPerStore[i] = Integer.valueOf(scan.next());
    	}
    	
    	Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
    	for(int i = 0; i < numTypes; i++) {
    		String pkg = scan.next();
    		int vrs = Integer.valueOf(scan.next());
    		
    		hash.put(pkg, vrs);
    	}
    	
    	// Checking
    	for(int i = 0; i < numStores; i++) {
    		
    		int sum = 0;
    		for(int j = 0; j < typesPerStore[i]; j++) {
    			
    			String pkg = scan.next();
        		int vrs = Integer.valueOf(scan.next());
        		
        		sum += hash.get(pkg) - vrs;
        		
    		}
    		System.out.println(sum);
    	}
    	
    	scan.close();
    	
    }

}
