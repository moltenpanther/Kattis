import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Kattis {
	
	static Stack<Integer> stack = new Stack<Integer>();
	static Queue<Integer> queue = new LinkedList<Integer>();
	static PriorityQueue<Integer> prior = new PriorityQueue<Integer>(new CompMax());
	
	static boolean checkS = true;
	static boolean checkQ = true;
	static boolean checkP = true;
	
	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	while(scan.hasNext()) {
    		
    		int num = scan.nextInt();
    		for(int i = 0; i < num; i++) {
    			if(scan.nextInt() == 1) {
    				add(scan.nextInt());
    			}else {
    				remove(scan.nextInt());
    			}
    		}
    		    		
    		if(checkS && !checkQ && !checkP) {
    			System.out.println("stack");
    		}else if(!checkS && checkQ && !checkP) {
    			System.out.println("queue");
    		}else if(!checkS && !checkQ && checkP) {
    			System.out.println("priority queue");
    		}else if(!checkS && !checkQ && !checkP) {
    			System.out.println("impossible");
    		}else {
    			System.out.println("not sure");
    		}
    		
    		stack = new Stack<Integer>();
    		queue = new LinkedList<Integer>();
    		prior = new PriorityQueue<Integer>(new CompMax());
    		
    		checkS = true;
    		checkQ = true;
    		checkP = true;
    	}
    	
    	scan.close();
	}
	
	public static void add(int num) {
		stack.push(num);
		queue.add(num);
		prior.offer(num);
	}
	
	public static void remove(int num) {
		if(stack.size() > 0) {	
			if(stack.pop() != num) {
				checkS = false;
			}
			if(queue.remove() != num) {
				checkQ = false;
			}
			if(prior.remove() != num) {
				checkP = false;
			}
		}else {
			checkS = false;
			checkQ = false;
			checkP = false;
		}
	}
	
	static class CompMax implements Comparator<Integer> {
		public int compare(Integer o1, Integer o2) {
			return o1 < o2 ? 1 : -1;
		}
	}

}