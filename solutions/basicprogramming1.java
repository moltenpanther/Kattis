import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        int task = scan.nextInt();
        
        if(task == 1) {
        	System.out.println(7);
        }
        
        if(task == 2) {
        	
        	int A = scan.nextInt();
        	int B = scan.nextInt();

        	if(A > B) {
        		System.out.println("Bigger");
        	}else if(A == B) {
        		System.out.println("Equal");
        	}else {
        		System.out.println("Smaller");
        	}       
        	
        }	
        if(task == 3) {
        	
           	int A = scan.nextInt();
        	int B = scan.nextInt();    	
        	int C = scan.nextInt();    	
        	
        	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        	queue.add(A);
        	queue.add(B);
        	queue.add(C);
        	
        	queue.remove();
        	System.out.println(queue.remove());        
        }
        
        if(task == 4) {
        	
        	long sum = 0;
        	for (int i = 0; i < size; i++) {
        		int num = scan.nextInt();
        		sum += num;				
    	 	}
        	
        	System.out.println(sum);        
        }
        
        if(task == 5) {
        	
        	long sum = 0;
        	for (int i = 0; i < size; i++) {
    			int num = scan.nextInt();
        		if(num % 2 == 0) {
        			sum += num;				
    			}
    		}
        	
        	System.out.println(sum);        
        }
        
        if(task == 6) {
        	
        	StringBuilder sb = new StringBuilder();
        	
        	for (int i = 0; i < size; i++) {
        		int num = scan.nextInt() % 26;
        		char letter = (char)(num + 97);
        		sb.append(letter);  		
    		}
        	
        	System.out.println(sb);   
        }
        
        if(task == 7) {
        	
        	int[] arr = new int[size];
        	for (int i = 0; i < size; i++) {
    			arr[i] = scan.nextInt();
    		}
        	
        	HashSet<Integer> hash = new HashSet<Integer>();
        	boolean done = false;
        	int index = 0;
        	while(!done) {
        		
        		index = arr[index];
        		
        		if(index < 0 || index >= size) {
        			System.out.println("Out");
        			done = true;
        		}else if(index == size - 1){
        			System.out.println("Done");
        			done = true;
        		}else if(hash.contains(index)) {
        			System.out.println("Cyclic");
        			done = true;
        		}
        		
        		hash.add(index);
        		
        	}
        	        
        }
        
        scan.close();
    }

    
}