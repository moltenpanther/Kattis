import java.util.Scanner;
import java.util.Stack;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int num = Integer.valueOf(scan.next());
    	
    	for(int i = 0; i < num; i++) {
    		
    		Stack<Character> enc = new Stack<Character>();
    		String adv = scan.next();
    		enc.push('0');
    		boolean check = true;
    		
    		for(int j = 0; j < adv.length(); j++) {
    	
    			char item = adv.charAt(j);
    			
    			if(item == '$' || item == '|' || item == '*') {
					enc.push(item);
    			}else if((item == 'b' && enc.peek() == '$') || (item == 't' && enc.peek() == '|') || (item == 'j' && enc.peek() == '*')) {
					if(enc.peek() == '0') {
						check = false;
	    				j = adv.length();
					}else {
						enc.pop();						
					}
    			}else if(item == '.'){
    				
    			}else {
    				check = false;
    				j = adv.length();    				
    			}
			}    	
			if(enc.size() > 1) {
    			check = false;
    		}
    		if(check) {
    			System.out.println("YES");
    		}else {
    			System.out.println("NO");
    		}
    	}
    	scan.close();
    }
}