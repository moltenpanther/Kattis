import java.io.IOException;
import java.util.Scanner;

public class meanwords {

    public static void main(String[] args) throws IOException {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int num = scan.nextInt();
    	String[] words = new String[num];
    	
    	int maxLength = 0;
    	for(int i = 0; i < num; i++) {
    		
    		String word = scan.next();
    		words[i] = word;
    		
    		if(word.length() > maxLength) {
    			maxLength = word.length();
    		}
    		
    	}

    	String ans = "";
    	for(int i = 1; i <= maxLength; i++) {
    		
    		int sum = 0;
    		int count = 0;
    		for(int j = 0; j < num; j++) {
    			
    			String word = words[j];
    			if(word.length() >= i) {
    				char letter = word.charAt(i - 1);
    				sum += letter;
    				count++;
    			}
    					
    		}
    		
    		int avg = (int)Math.floor(sum / count);
    		ans += (char) avg;
    	}
    	
    	System.out.println(ans);
    	
    	scan.close();
    	
    }

}
