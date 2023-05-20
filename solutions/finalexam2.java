import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int num = scan.nextInt();
    	int score = 0;
    	char prevAns = 'z';
    	
    	for(int i = 1; i <= num; i++) {
    		String ans = scan.next();
    		char letter = ans.charAt(0);
    		
    			if(letter == prevAns) {
	    			score += 1;
	    		}else {}
    		
			prevAns = letter;
    	}
    	
    	System.out.println(score);
    	
        scan.close();
    }
}