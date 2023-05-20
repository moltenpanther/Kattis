import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        char[] key = scan.nextLine().toCharArray();
        String[] inp = scan.nextLine().split(" ");
        
        boolean match = false;
        if(key.length == inp.length) {
        	
	        HashMap<String, Character> toChar = new HashMap<String, Character>();
	        HashMap<Character, String> toStr = new HashMap<Character, String>();
	        
	        match = true;
	        for(int i = 0; i < inp.length; i++) {
	        	
	        	if(!toChar.containsKey(inp[i])) {
	        		toChar.put(inp[i], key[i]);
	        	}
	        	if(!toStr.containsKey(key[i])) {
	        		toStr.put(key[i], inp[i]);
	        	}
	        	
	        	
	    		if(toChar.get(inp[i]) != key[i] || !toStr.get(key[i]).equals(inp[i])) {
	    			match = false;
	    			i = inp.length;
	    		}
	        		
	        }

        }
        
        if(match) {
        	System.out.println("True");        	
        }else {
        	System.out.println("False");
        }
        
        scan.close();
		
	}	

}
