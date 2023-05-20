import java.util.HashSet;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int courses = scan.nextInt();
        
        while(courses != 0) {
        	
	        int cats = scan.nextInt();
	        
	        HashSet<Integer> hash = new HashSet<Integer>();
	        for(int i = 0; i < courses; i++) {
	        	hash.add(scan.nextInt());
	        }
	        
	        boolean good = true;
	        for(int i = 0; i < cats; i++) {
	        	
	        	int num = scan.nextInt();
	        	int req = scan.nextInt();
	        	
	        	for(int j = 0; j < num; j++) {
	        		if(hash.contains(scan.nextInt())) {
	        			req--;
	        		}
	        	}
	        	
	        	if(req > 0) {
	        		good = false;
	        	}
	        }
	        
	        if(good) {
	        	System.out.println("yes");
	        }else {
	        	System.out.println("no");
	        }
        
	        courses = scan.nextInt();
	        
        }
        scan.close();
    }
    
}
