import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cardtrick2 {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int cases = scan.nextInt();
    	
    	for(int i = 0; i < cases; i++) {
    		
	    	int num = scan.nextInt();
	    	
	    	// Queue
	    	Queue queue = new LinkedList();
	    	queue.add(num);
	    	
	    	while(num > 1) {    	
		    	num--;
		    	queue.add(num);
		    	
		    	for(int j = 0; j < num; j++) {
		    		queue.add(queue.remove());
		    	}
		    	
	    	}
	    	
	    	String ans = "";
	    	for(int j = queue.size() - 1; j >= 0; j--) {
	    			ans = queue.remove() + " " + ans;
	    	}
	    	
	    	System.out.println(ans);
	    	}
    	
    	scan.close();
    	
    }

}
