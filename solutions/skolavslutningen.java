import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class skolavslutningen {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int rows = Integer.parseInt(scan.next());
        int cols = Integer.parseInt(scan.next());
        int classes = Integer.parseInt(scan.next());
        
        String[] grid = new String[rows];
        for(int i = 0; i < rows; i++) {
        	String row = scan.next();
        	grid[i] = row;
        }
        
        // Loop through doneCols to check progress
        // and skip when necessary
        boolean[] doneCols = new boolean[cols];
        ArrayList<HashSet<Character>> list = new ArrayList<HashSet<Character>>();
        for(int i = 0; i < doneCols.length; i++) {
        	
        	// Triggers if the col hasn't been put in a hash yet
        	if(!doneCols[i]) {
        		
        		HashSet<Character> hash = new HashSet<Character>();
        		list.add(hash);
        		
        		// Adds the col to a hash
        		for(int j = 0; j < grid.length; j++) {
        			hash.add(grid[j].charAt(i));
        		}
        		
        		// Loops through remaining columns
        		for(int j = i + 1; j < cols; j++) {
        			
        			// Triggers if the col hasn't been put in a hash yet 
        			if(!doneCols[j]) {
        				
        				// Loop through the col at index j
        				for(int k = 0; k < rows; k++) {
        					
        					char letter = grid[k].charAt(j);
        					
        					// Tests each letter for presence
        					// in a hash
        					for(HashSet<Character> hashCheck : list) {
        						if(hashCheck.contains(letter)) {
        							
        							k = rows;
        							doneCols[j] = true;
        							
        							// Adds that column
        							for(int l = 0; l < rows; l++) {
        								letter = grid[l].charAt(j);
        								if(!hashCheck.contains(letter)) {
        									hashCheck.add(letter);
        								}
        							}
        						}	
      //  						hashCheck
        					}        					
        				}
        			}
        		}
        	}
        }
        
        /*
    	for(HashSet<Character> hashez : list) {
        	System.out.println(hashez.toString());
        }*/
        
        
        // Output
        System.out.println(list.size());      
        
        scan.close();
    }

}
