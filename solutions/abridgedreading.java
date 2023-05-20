import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
	
public class abridgedreading {
	
	HashMap<Integer, LinkedList<Chapter>> hash = new HashMap<Integer, LinkedList<Chapter>>();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int chaps = scan.nextInt();
		int deps = scan.nextInt();
		
		Chapter[] pages = new Chapter[chaps];
		
		for(int i = 0; i < chaps; i++) {
			Chapter num = new Chapter(scan.nextInt(), i);
			pages[i] = num;
		}
		
		for(int i = 0; i < deps; i++) {
			int num1 = scan.nextInt() - 1;
			int num2 = scan.nextInt() - 1;
			
			pages[num2].prev = pages[num1];
			pages[num1].leaf = false;
			pages[num2].root = false;
		}
		
		ArrayList<Chapter> leaves = new ArrayList<Chapter>();
		ArrayList<Chapter> roots = new ArrayList<Chapter>();
		
		for(int i = 0; i < chaps; i++) {
			if(pages[i].leaf) {
				leaves.add(pages[i]);
			}
			if(pages[i].root) {
				roots.add(pages[i]);
			}
		}

		int minFin = Integer.MAX_VALUE;
		int minTot = Integer.MAX_VALUE;
		for(int i = 0; i < leaves.size(); i++) {
				
			Chapter[] copy = pages.clone();
			Chapter path = copy[(leaves.get(i).index)];
			
			ArrayList<Chapter> visited = new ArrayList<Chapter>();
			
			int min1 = 0;
			while(path.prev != null) {
				min1 += path.val;
				visited.add(path);
				path = path.prev;
			}
			
			min1 += path.val;
			visited.add(path);
			
			int min2 = Integer.MAX_VALUE;			
			for(int j = 0; j < leaves.size(); j++) {
				
				if(i != j) {
					Chapter[] copy2 = copy.clone();
					Chapter path2 = copy2[leaves.get(j).index];
					
					int sum2 = 0;
					while(path2.prev != null) {
									
						if(!visited.contains(path2)) {
							sum2 += path2.val;							
						}
						path2 = path2.prev;	
					}
					
					if(!visited.contains(path2)) {
						sum2 += path2.val;						
					}
					
					if(sum2 < min2) {
						min2 = sum2;
					}
				}
			}
			visited.clear();
			
			minTot = min1 + min2;
			if(minTot < minFin) {
				minFin = minTot;
			}
								
		}
		
		System.out.println(minFin);
		
		scan.close();
	}
		
}

class Chapter {
	
	char color = 'W';
	Chapter prev = null;
	int val;
	int index;
	boolean leaf = true;
	boolean root = true;
	
	public Chapter(int val, int index) {
		this.val = val;
		this.index = index;
	}
	
	public String toString() {
		
		if(prev != null) {
			return (index + 1) + ": " + val + "-" + leaf + " -> " + (prev.index + 1);			
		}else {
			return (index + 1) + ": " + val + "-" + leaf;			
		}
	}
}