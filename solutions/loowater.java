import java.util.Arrays;
import java.util.Scanner;

public class loowater {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
       	int numHeads = 0;
    	while((numHeads = scan.nextInt()) != 0) {
    		
    		int numKnights = scan.nextInt();
    		
    		int[] heads = new int[numHeads];
    		int[] knights = new int[numKnights];
    		
    		for(int i = 0; i < numHeads; i++) {
    			heads[i] = scan.nextInt();
    		}
    		for(int i = 0; i < numKnights; i++) {
    			knights[i] = scan.nextInt();
    		}
    		
    		Arrays.sort(heads);
    		Arrays.sort(knights);
    		
    		boolean success = true;
    		int knightIndex = 0;
    		int coins = 0;
    		for(int i = 0; i < numHeads; i++) {
    			
    			boolean slayed = false;
    			for(int j = knightIndex; j < numKnights; j++) {    				
    				if(knights[j] >= heads[i]) {
    					coins += knights[j];
    					knightIndex = j + 1;
    					j = numKnights;
    					slayed = true;
    				}
    			}
    			
    			if(!slayed) {
    				success = false;
    				i = numHeads;
    			}
    			
    		}
    		
    		if(success) {
    			System.out.println(coins);
    		}else {
    			System.out.println("Loowater is doomed!");
    		}
    	
    		
    	}
    	
    	// Output
    	System.out.println("");
   		
    	scan.close();
    }

}
