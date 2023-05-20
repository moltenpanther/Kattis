import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int hands = scan.nextInt();
    	String suit = scan.next();
    	String handCheck;
    	String suitCheck;
    	String cardNew;
    	String suitNew;
    	int score = 0;
    
    	for(int i = 1; i <= hands * 4; i++) {
    		
    		handCheck = scan.next();
    		cardNew = handCheck.substring(0, 1);
    		suitNew = handCheck.substring(1, 2);
    			
    			if(cardNew.equals("A")) {
    				score += 11;
    			}else if(cardNew.equals("K")) {
    				score += 4;
    			}else if(cardNew.equals("Q")) {
    				score += 3;
    			}else if(cardNew.equals("J")) {
    				
    				if(suitNew.equals(suit)) {
    					score += 20;
    				}else {
    					score += 2;
    				}
    			}else if(cardNew.equals("T")) {
    				score += 10;
    			}else if(cardNew.equals("9")) {
    				
    				if(suitNew.equals(suit)) {
    					score += 14;
    				}else {}
    			}else {}
    			
    	}
    	
    	System.out.println(score);
    	
    	scan.close();
    }
}