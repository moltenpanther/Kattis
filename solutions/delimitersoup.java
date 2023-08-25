import java.util.Scanner;
import java.util.Stack;

public class delimitersoup {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	Stack<Character> stack = new Stack<Character>(); 
    	
    	scan.nextLine();
    	String line = scan.nextLine();
    	
    	boolean good = true;
    	for(int i = 0; i < line.length(); i++) {
    		
    		char ch = line.charAt(i);
    		if(ch == '(' || ch == '[' || ch == '{') {
    			stack.push(ch);
    		}else if(ch == ')' || ch == ']' || ch == '}') {
    			if(stack.size() == 0) {
    				good = false;
    				System.out.println(ch + " " + i);
    			}else if(ch == ')') {
	    			if(stack.peek() == '(') {
	    				stack.pop();
	    			}else {
	    				good = false;
	    				System.out.println(ch + " " + i);
	    				i = line.length();
	    			}
	    		}else if(ch == ']') {
	    			if(stack.peek() == '[') {
	    				stack.pop();
	    			}else {
	    				good = false;
	    				System.out.println(ch + " " + i);
	    				i = line.length();
	    			}
	    		}else if(ch == '}') {
	    			if(stack.peek() == '{') {
	    				stack.pop();
	    			}else {
	    				good = false;
	    				System.out.println(ch + " " + i);
	    				i = line.length();
	    			}
	    		}
    		}
    	}
    	
    	if(good) {
    		System.out.println("ok so far");
    	}
    	
    	scan.close();
    	
    }

}
