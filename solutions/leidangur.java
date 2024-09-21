import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class leidangur {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        
        Stack<Character> stack = new Stack<Character>();
        boolean failure = false;
        
        for(int i = 0; i < line.length() && !failure; i++) {
        	
        	char ch = line.charAt(i);
        	boolean match = false;
        	
        	if(ch != '.') {
        		
	        	if(ch == 'p') {
	        		stack.push('p');
	        	}else if(ch == 'g') {
	        		stack.push('g');
	        	}else if(ch == 'o') {
	        		stack.push('o');
	        		
	        	}else if(ch == 'P') {
	        		
	        		while(!stack.isEmpty()) {
	        			char pop = stack.pop();
	        			if(pop == 'p') {
	        				match = true;
	        				break;
	        			}
	        		}
	        		
	        	}else if(ch == 'G') {
	        	
	        		while(!stack.isEmpty()) {
	        			char pop = stack.pop();
	        			if(pop == 'g') {
	        				match = true;
	        				break;
	        			}
	        		}
	
	        	}else if(ch == 'O') {
	        		
	        		while(!stack.isEmpty()) {
	        			char pop = stack.pop();
	        			if(pop == 'o') {
	        				match = true;
	        				break;
	        			}
	        		}
	        		
	        	}
	        	
	        	if(!match && ch > 64 && ch < 91) {
	        		failure = true;
	        	}
	        	
        	}
        	
        }
        
        // Output
        if(failure) {
        	System.out.println("Neibb");
        }else {
        	
        	int p = 0;
        	int g = 0;
        	int o = 0;
        	
        	while(!stack.isEmpty()) {
        		
        		char ch = stack.pop();
        		if(ch == 'p') {
        			p++;
        		}else if(ch == 'g') {
        			g++;
        		}else if(ch == 'o') {
        			o++;
        		}
        	}
        	
        	System.out.println(p);
        	System.out.println(g);
        	System.out.println(o);
        }
        
    	br.close();
    }

}
