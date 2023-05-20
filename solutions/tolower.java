import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int probs = scan.nextInt();
        int tests = scan.nextInt();
        
        int count = 0;
        for(int i = 0; i < probs; i++) {
        	
        	boolean pass = true;
        	for(int j = 0; j < tests; j++) {
        		
        		String inp = scan.next();
        		
        		for(int k = 1; k < inp.length(); k++) {
        			char ch = inp.charAt(k);
        			
        			if(ch < 97) {
        				pass = false;
        			}
        			
        		}
        		
        	}
        	
        	if(pass) {
        		count++;
        	}
        }
        
        System.out.println(count);
             
        scan.close();
    }    
	
}
