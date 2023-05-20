import java.util.Scanner;

public class Kattis {

    public static void main(String args[]) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	String line = "";
    	while(!(line = scan.nextLine()).equals("end")){
	    	String[] letters = makeLetters(line);
	    	printWord(letters);
	    	System.out.println("\n");
    	}

    	System.out.println("end");
    	scan.close();
    }
    
    public static String[] makeLetters(String time) {
    	
    	String[] nums = {"+---+  |   |  |   |  +   +  |   |  |   |  +---+  ","    +      |      |      +      |      |      +  ", "+---+      |      |  +---+  |      |      +---+  ", "+---+      |      |  +---+      |      |  +---+  ", "+   +  |   |  |   |  +---+      |      |      +  ", "+---+  |      |      +---+      |      |  +---+  ", "+---+  |      |      +---+  |   |  |   |  +---+  ", "+---+      |      |      +      |      |      +  ", "+---+  |   |  |   |  +---+  |   |  |   |  +---+  ", "+---+  |   |  |   |  +---+      |      |  +---+  "};
    	
    	String[] letters = new String[time.length()];
    	
    	for(int i = 0; i < time.length(); i++) {
    		if(time.charAt(i) == ':') {
    			letters[i] = "";
    		}else {
    			letters[i] = nums[Integer.parseInt(time.substring(i, i + 1))];
    		}		
    	}
    	
    	return letters;
    }
    
    public static void printWord(String[] letters) {
    	
    	int num = 0;
    	int count = 0;
    	for(int i = 0; i < 7; i++) {
    		String line = "";
    		for(int j = 0; j < 5; j++) {
    			if(j == 2) {
    				if(i == 2 || i == 4) {
    					line += "o  ";    					
    				}else {
    					line += "   ";
    				}
    			}else if(j == 4) {
    				line += letters[j].substring(count, count + 5);
    			}else {    				
    				line += letters[j].substring(count, count + 7);    				
    			}
    		}
    		System.out.println(line);
  
    		count += 7; 			
    		
    	}
    }
}