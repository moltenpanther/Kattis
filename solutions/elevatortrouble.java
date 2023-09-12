import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class elevatortrouble {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int floors = scan.nextInt();
 		int start = scan.nextInt();
 		int goal = scan.nextInt();
 		int up = scan.nextInt();
 		int down = scan.nextInt();
    	
 		boolean success = false;
 		
 		int[] visited = new int[floors + 1];
 		Queue<Integer> queue = new LinkedList<Integer>();

 		visited[start]++;
 		queue.add(start);
 		
 		int ans = 0;
 		while(queue.size() > 0 && !success) {
 			
 			int floor = queue.remove();
 			if(floor == goal) {
 				ans = visited[floor];
 				success = true;
 			}else {
 				
 				int jumpUp = floor + up;
 				int jumpDown = floor - down;
 				
 				if(jumpUp <= floors) { 					
	 				if(visited[jumpUp] == 0) {
	 					visited[jumpUp] = visited[floor] + 1;
	 					queue.add(jumpUp); 					
	 				}
 				}
 				
 				if(jumpDown >= 1) { 					
	 				if(visited[jumpDown] == 0) {
	 					visited[jumpDown] = visited[floor] + 1;
	 					queue.add(jumpDown); 					
	 				}
 				}
 			}	
 		}
 		
    	// Output
 		if(success) {
 			System.out.println(ans - 1); 			
 		}else {
 			System.out.println("use the stairs");
 		}
   		
    	scan.close();
    }

}
