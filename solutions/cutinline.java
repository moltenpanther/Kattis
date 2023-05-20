import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        String[] queue = new String[num];
        
        for(int i = 0; i < queue.length; i++) {
        	queue[i] = scan.next();
        }
        
        num = scan.nextInt();
        for(int i = 0; i < num; i++) {
        	if(scan.next().equals("cut")) {
        		queue = cutQueue(queue, scan.next(), scan.next());
        	}else{
        		queue = leaveQueue(queue, scan.next());
        	}
        }
        
        print(queue);
        
        scan.close(); 
    }
    
    public static String[] cutQueue(String[] queue, String in, String cut) {
    	
    	String[] newQueue = new String[queue.length + 1];
    	int j = 0;
    	for(int i = 0; i < queue.length; i++) {	
    		if(queue[i].equals(cut)) {
    			newQueue[j] = in;
    			j++;
    		}
    		newQueue[j] = queue[i];
    		j++;
    	}
    	return newQueue;
    }
    
    public static String[] leaveQueue(String[] queue, String out) {
    	
    	String[] newQueue = new String[queue.length - 1];
    	int j = 0;
    	for(int i = 0; i < queue.length; i++) {
    		if(!queue[i].equals(out)) {
    			newQueue[j] = queue[i];
    			j++;		    			
    		}
    	}
    	return newQueue;
    }
    
    public static void print(String[] queue) {
        for(int i = 0; i < queue.length; i++) {
        	System.out.println(queue[i]);
        }
    }
                
}