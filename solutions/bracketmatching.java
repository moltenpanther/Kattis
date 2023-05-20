import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Kattis {

    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        
        scan.next();
        String str = scan.next();
        
        boolean valid = true;
        for(int i = 0; i < str.length(); i++) {
        	
        	char bracket = str.charAt(i);
        	
        	if(bracket == '(' || bracket == '{' || bracket == '[') {
        		stack.push(bracket);
        	}

    		char peek = '0';
        	try {
        		peek = stack.peek();        		
        	}catch(Exception ex) {
        		
        	}
        	
        	if(bracket == ')') {
        		if(peek == '(') {
        			stack.pop();
        		}else {
        			i = str.length();
        			valid = false;
        		}
        	}
        	
        	if(bracket == '}') {
        		if(peek == '{') {
        			stack.pop();
        		}else {
        			i = str.length();
        			valid = false;
        		}
        	}
        	
        	if(bracket == ']') {
        		if(peek == '[') {
        			stack.pop();
        		}else {
        			i = str.length();
        			valid = false;
        		}
        	}
        }
        
        if(stack.size() > 0) {
        	valid = false;
        }
        
        if(valid) {
        	System.out.println("Valid");
        }else {
        	System.out.println("Invalid");
        }
        
        scan.close();
    }
    
}