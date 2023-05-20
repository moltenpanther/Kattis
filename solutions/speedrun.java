import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        int goal = scan.nextInt();
        int tasks = scan.nextInt();
        
        int[] finishes = new int[tasks];
        
        for(int i = 0; i < tasks; i++) {
        	
        	int begin = scan.nextInt();
        	int end = scan.nextInt();
        	
        	hash.put(end, begin);
        	finishes[i] = end;
        }
        
        Arrays.sort(finishes);
        
        int lastFinish = Integer.MIN_VALUE;
        int count = 0;        
        for(int i = 0; i < tasks; i++) {
        	
        	int start = hash.get(finishes[i]);
        	if(start >= lastFinish) {
        		count++;
        		lastFinish = finishes[i];
        	}

        	if(count >= goal) {
        		System.out.println("YES");
        		i = tasks;
        	}
        }
        
        if(count < goal) {
        	System.out.println("NO");
        }
           
        scan.close();
    }
    
}
