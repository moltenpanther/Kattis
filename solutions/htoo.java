import java.util.Scanner;

public class htoo {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	String molecule = scan.next() + " ";
    	int num = Integer.parseInt(scan.next());
    	
    	int[] elements = new int[26];

    	// Filling counting array for molecule
    	for(int i = 0; i < molecule.length() - 1; i++) {
    		
    		int letter = molecule.charAt(i) - 65;
    		int next = molecule.charAt(i + 1);
    		int atoms = 1;
    		
    		String numStr = "";
    		while(next < 65 && next != 32) {
    			numStr += (next - 48);
    			i++;
    			next = molecule.charAt(i + 1);
    		}

    		if(!numStr.isEmpty()) {
    			atoms = Integer.parseInt(numStr);    			
    		}
    		
    		atoms *= num;
    		elements[letter] += atoms;
    		
    	}
    	
    	String desired = scan.next() + " ";
    	int[] elementsDesired = new int[26];
    	
    	// Filling counting array for desired
    	for(int i = 0; i < desired.length() - 1; i++) {
    		
    		int letter = desired.charAt(i) - 65;
    		int next = desired.charAt(i + 1);
    		int atoms = 1;
    		
    		String numStr = "";
    		while(next < 65 && next != 32) {
    			numStr += (next - 48);
    			i++;
    			next = desired.charAt(i + 1);
    		}
    		
    		if(!numStr.isEmpty()) {
    			atoms = Integer.parseInt(numStr);    			
    		}
    		
    		elementsDesired[letter] += atoms;    		
    	}
    	
    	// Counting out
    	int count = Integer.MAX_VALUE;
    	for(int i = 0; i < elements.length; i++) {
    		
    		if(elementsDesired[i] > 0) {
    			
    			if(elements[i] == 0) {
    				count = 0;
    				i = elements.length;
    			}else {
    				double div = elements[i] / elementsDesired[i];
    				if(div < count) {
    					count = (int)div;
    				}
    			}
    		}
    	}   	
    	
    	// Output
    	System.out.println(count);
   		
    	scan.close();
    }

}
