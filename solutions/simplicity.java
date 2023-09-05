import java.util.HashMap;
import java.util.Scanner;

public class simplicity {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	int[] check = new int[26];
    	
    	// Implementation like a Counting Sort
    	String word = scan.next();
    	int sum = word.length();
    	
    	for(int i = 0; i < word.length(); i++) {
    		int letter = word.charAt(i) - 97;
    		check[letter]++;
    	}
    	
    	// Looping to find # unique values and
    	// Top max numbers
    	int unique = 0;
    	int max = -1;
    	int index = -1;
    	for(int i = 0; i < check.length; i++) {
    		
    		int num = check[i];
    		if(num > 0) {
    			unique++;
    		}
    		
    		if(num > max) {
    			max = num;
    			index = i;
    		}
    		
    	}
    	
    	sum -= max;
    	
    	// Second loop to find second max
    	max = -1;
    	for(int i = 0; i < check.length; i++) {
    		
    		int num = check[i];    		
    		if(num > max && i != index) {
    			max = num;
    		}
    	}
    	
    	sum -= max;
    	
    	if(unique < 2) {
    		System.out.println(0);
    	}else {
    		System.out.println(sum);
    	}
    	
    	scan.close();
    }
    
}
