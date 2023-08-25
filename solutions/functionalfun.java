import java.util.HashSet;
import java.util.Scanner;

public class functionalfun {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	while(scan.hasNext()) {
    		
    		// Loading in values
    		scan.nextLine().split(" ");
    		String[] codomain = scan.nextLine().split(" ");

    		// Checking mapping
    		boolean inj = true;
    		boolean sur = false;
    		boolean not = false;
    		
    		HashSet<String> domHash = new HashSet<String>();
    		HashSet<String> codHash = new HashSet<String>();
    		
    		int num = Integer.parseInt(scan.nextLine());
    		for(int i = 0; i < num; i++) {
    			
    			String[] map = scan.nextLine().split(" ");
    			if(domHash.contains(map[0])){
    				not = true;
    			}else {
    				
    				domHash.add(map[0]);    				
    				if(codHash.contains(map[2])) {
    					inj = false;
    				}	
    				codHash.add(map[2]);
    			}
    		}
    		
    		if(codomain.length - 1 == codHash.size()) {
    			sur = true;
    		}
    		
    		if(num == 0) {
    			not = true;
    		}
    		
    		// Output
    		if(not) {
    			System.out.println("not a function");
    		}else if(inj) {
    			if(sur) {
    				System.out.println("bijective");    				
    			}else {
    				System.out.println("injective");
    			}
    		}else if(sur) {
    			System.out.println("surjective");
    		}else {
    			System.out.println("neither injective nor surjective");
    		}
    		
    	}
    	
    	scan.close();
    	
    }

}
