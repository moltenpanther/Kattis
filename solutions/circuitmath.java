import java.util.Scanner;
import java.util.Stack;

public class circuitmath {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = Integer.parseInt(scan.nextLine());
        
        String[] boolStr = scan.nextLine().split(" ");
        boolean[] bool = new boolean[num];

        for(int i = 0; i < num; i++) {
        	if(boolStr[i].equals("T")) {
        		bool[i] = true;        		
        	}else {
        		bool[i] = false;
        	}
        }
        
        String[] circuit = scan.nextLine().split(" ");
        Stack<Boolean> stack = new Stack<Boolean>();
        
        for(int i = 0; i < circuit.length; i++) {
        	
        	char val = circuit[i].charAt(0);
        	
        	if(val > 64 && val < 91) {
        		stack.add(bool[val - 65]);
        		
        		// AND
        	}else if(val == '*') {
        		boolean val1 = stack.pop();
        		boolean val2 = stack.pop();
        		if(val1 && val2) {
        			stack.push(true);
        		}else {
        			stack.push(false);
        		}
        		
        		// OR
        	}else if(val == '+') {
        		boolean val1 = stack.pop();
        		boolean val2 = stack.pop();        		
        		if(val1 || val2) {
        			stack.push(true);
        		}else {
        			stack.push(false);
        		}
        		
        		// NOT
        	}else if(val == '-') {
        		boolean val1 = stack.pop();
        		stack.push(!val1);
        	}
        	
        }
        
        boolean out = stack.pop();
        if(out) {
        	System.out.println("T");        	
        }else {
        	System.out.println("F");
        }
        
        scan.close();
    }

}
