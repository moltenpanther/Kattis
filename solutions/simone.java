import java.util.Scanner;

public class simone {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int length = scan.nextInt();
    	int colors = scan.nextInt();
    	
    	int[] freq = new int[colors + 1];
    	
    	for(int i = 0; i < length; i++) {
    		int named = scan.nextInt();
    		freq[named]++;
    	}
    	
    	// Counting
    	String ans = "";
    	int min = Integer.MAX_VALUE;
    	for(int i = 1; i < colors + 1; i++) {
    		if(freq[i] < min) {
    			min = freq[i];
    		}
    	}

    	int count = 0;
    	for(int i = 1; i < colors + 1; i++) {
    		if(freq[i] == min) {
    			ans += i + " ";
    			count++;
    		}
    	}
    	
    	System.out.println(count);
    	System.out.println(ans);
    	
    	scan.close();
    	
    }

}
