import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String[] cards = new String[5];
        int count = 0;
        int ans = 0;
        
        for(int i = 0; i < 5; i++) {
        	cards[i] = scan.next();
        }
        
        for(int i = 0; i < 5; i++) {	
        	count = 0;
        	
        	for(int j = i + 1; j < 5; j++) {
            	if(cards[i].charAt(0) == cards[j].charAt(0)) {
            		count++;            		
            	}
        	}
        	
        	if(count > ans) {
        		ans = count;
        	}
        	
        }
        
        System.out.println(ans + 1);
        
        scan.close();
    }

}