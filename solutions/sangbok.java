import java.util.PriorityQueue;
import java.util.Scanner;

public class sangbok {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int secondsMax = scan.nextInt() * 60;
    	int numSongs = scan.nextInt();
    	
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    	
    	for(int i = 0; i < numSongs; i++) {
    		int song = scan.nextInt();
    		queue.add(song);
    	}
    	    	
    	int sum = 0;
    	boolean room = true;
    	while(room) {
    		
    		int song = queue.remove();
    		if(secondsMax - song >= 0) {
    			secondsMax -= song;
    			sum += song;
    		}else {
    			room = false;
    		}
    		
    		if(queue.isEmpty()) {
    			room = false;
    		}
    		
    	}
    	
    	System.out.println(sum);
    	
    	scan.close();
    	
    }

}
