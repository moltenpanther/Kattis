import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class countdoubles {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int num = scan.nextInt();
    	int size = scan.nextInt();
    	
    	Queue<Integer> queue = new LinkedList<Integer>();
    	int evens = 0;
    	int count = 0;
    	
    	// Loading in first subarray
    	for(int i = 0; i < size; i++) {
    		int next = scan.nextInt();
    		if(next % 2 == 0) {
    			evens++;
    		}
    		queue.add(next);
    	}
    	
    	if(evens > 1) {
    		count++;
    	}
    	
    	for(int i = size; i < num; i++) {
    		
    		int out = queue.remove();
    		int in = scan.nextInt();
    		queue.add(in);
    		
    		if(out % 2 == 0) {
    			evens--;
    		}
    		if(in % 2 == 0) {
    			evens++;
    		}
    		
    		if(evens > 1) {
        		count++;
        	}
    		
    	}
    	
    	System.out.println(count);
    	
    	scan.close();
    	
    }

}
