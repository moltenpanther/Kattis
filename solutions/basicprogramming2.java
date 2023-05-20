import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        int task = scan.nextInt();
        
        if(task == 1) {
        	
        	HashSet<Integer> hash = new HashSet<Integer>();
        	boolean done = false;
        	for(int i = 0; i < size; i++) {
        		
        		int num = scan.nextInt();
        		int req = 7777 - num;

        		hash.add(num);
        		if(hash.contains(req)) {
        			System.out.println("Yes");
        			i = size;
        			done = true;
        		}  
        	}
        	
        	if(!done) {
        		System.out.println("No");        		
        	}
        	
        }else if(task == 2) {
        	
        	HashSet<Integer> hash = new HashSet<Integer>();
        	boolean done = false;
        	for(int i = 0; i < size; i++) {
        		
        		int num = scan.nextInt();
        		if(hash.contains(num)) {
        			System.out.println("Contains duplicate");
        			i = size;
        			done = true;
        		}else {
        			hash.add(num);
        		}
        	}
        	
        	if(!done) {
        		System.out.println("Unique");        		
        	}
        	
        }else if(task == 3) {
        	
        	HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        	boolean done = false;
        	int goal = size / 2;
        	
        	for(int i = 0; i < size; i++) {
        		
        		int num = scan.nextInt();
        		int count = 1;
        		
        		if(!hash.containsKey(num)) {
        			hash.put(num, 1);
        		}else {
        			count = hash.get(num) + 1;
        			hash.put(num, count);
        		}
        		
        		if(count > goal) {
        			System.out.println(num);
        			i = size;
        			done = true;
        		}
        		
        	}
        	
        	if(!done) {
        		System.out.println("-1");        		
        	}
        	       	
        }else if(task == 4) {
        	
        	int[] arr = new int[size];
        	for(int i = 0; i < size; i++) {
        		arr[i] = scan.nextInt();
        	}
        	
        	Arrays.sort(arr);

        	if(size % 2 != 0) {
        		System.out.println(arr[size / 2]);
        	}else {
        		System.out.println(arr[size / 2 - 1] + " " + arr[size / 2]);
        	}
        	
        }else if(task == 5) {
        	
        	PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); 	
        	
        	for(int i = 0; i < size; i++) {				
        		int num = scan.nextInt();
        		if(num > 99 && num < 1000) {
        			queue.add(num);        			
        		}
			}
        	
        	StringBuilder sb = new StringBuilder();
        	while(queue.size() > 0) {
        		sb.append(queue.remove());
        		sb.append(' ');
        	}
        	
        	System.out.println(sb.toString());
        }
             
        scan.close();
    }
    
}