import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        HashMap<Integer, ArrayList<Island>> hash = new HashMap<Integer, ArrayList<Island>>();
        
        int max = scan.nextInt();
        int bridges = scan.nextInt();
        
        int start = -1;
        for(int i = 0; i < bridges; i++) {
        	
        	Island from = new Island(scan.nextInt());
        	Island to = new Island(scan.nextInt());
        	if(hash.containsKey(from.val)) {
        		hash.get(from.val).add(to);
        	}else {
        		ArrayList<Island> adj = new ArrayList<Island>();
        		adj.add(from);
        		adj.add(to);
        		
        		hash.put(from.val, adj);        		
        		if(start == -1) {
        			start = from.val;
        		}
        	}
        	
        	if(!hash.containsKey(to.val)) {
        		ArrayList<Island> adj = new ArrayList<Island>();
        		adj.add(to);
        		hash.put(to.val, adj);
        	}
        }
        
        int count = -1;
        if(bridges > 0) {
        	count = bfs(hash, start);        	
        }else {
        	count = 1;
        }
                
        if(count == max) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
        
        scan.close();
    }
    
	public static int bfs(HashMap<Integer, ArrayList<Island>> hash, int first) {
		
		ArrayList<Island> list = hash.get(first);
		Island start = list.get(0);
		start.color = 'G';
		start.dis = 0;
		
		Queue<Island> queue = new LinkedList<Island>();
		queue.add(start);
		
		int count = 1;
		while(queue.size() > 0) {
			
			Island isle = queue.remove();
			
			if(hash.containsKey(isle.val)) {
				
				list = hash.get(isle.val);				
			
				for(int i = 1; i < list.size(); i++) {		
					
					Island next = hash.get(list.get(i).val).get(0);
					
					if(next.color == 'W') {
						count++;
						next.color = 'G';
						next.dis = isle.dis + 1;
						next.prev = isle;
						queue.add(next);
					}
				}
			}
			
			isle.color = 'B';
		}
		
		return count;
		
	}	
	
}

class Island {
	
	char color = 'W';
	int dis = Integer.MAX_VALUE;
	Island prev = null;
	int val = -1;
	
	public Island(int val) {
		this.val = val;
	}
	
	public String toString() {
		return val + " " + color;
	}
	
}