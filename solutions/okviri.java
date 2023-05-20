import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String inp = scan.next();  
        String[] line = new String[5];
        		
        for(int i = 0; i < 5; i++) {
        	
        	String out = "";
        	   		
        	if(i == 0 || i == 4) {
	        	for(int j = 0; j < inp.length(); j++) {
	        		if(j % 3 == 2) {
	        			out += "..*.";
	        		}else {
	        			out += "..#.";        			
	        		}
	        	}
	        	out += ".";
        	}else if(i == 1 || i == 3) {
        		for(int j = 0; j < inp.length(); j++) {
	        		if(j % 3 == 2) {
	        			out += ".*.*";
	        		}else {
	        			out += ".#.#";        			
	        		}
	        	}
	        	out += ".";
        	}else {
        		for(int j = 0; j < inp.length(); j++) {
	        		if(j % 3 == 2) {
	        			out += "*." + inp.charAt(j) + ".";
	        		}else {
	        			if(j % 3 == 0 && j > 0) {
	        				out += "*." + inp.charAt(j) + ".";        				        				
	        			}else {
	        				out += "#." + inp.charAt(j) + ".";        				        				
	        			}
	        		}
	        	}
        		if(inp.length() % 3 == 0) {
        			out += "*";        			
        		}else {
        			out += "#";
        		}
        	}
        	
        	
        	line[i] = out;
        	
        }
        
        
        for(String x : line) {
        	System.out.println(x);
        }
        
        scan.close();
    }
    
}
