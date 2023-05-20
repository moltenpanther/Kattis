import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String order = scan.next();
        int cup = 1;
        int length = order.length();
        char swap = ' ';
        
        for(int i = 0; i < length; i++) {
        	
        	swap = order.charAt(i); 
        	
        	if(cup == 1) {
        		if(swap == 'A') {
        			cup = 2;
        		}else if(swap == 'C') {
        			cup = 3;
        		}else {
        			
        		}
        	}else if(cup == 2) {
        		if(swap == 'A') {
        			cup = 1;
        		}else if(swap == 'B') {
        			cup = 3;
        		}else {
        			
        		}
        	}else if(cup == 3) {
        		if(swap == 'B') {
        			cup = 2;
        		}else if(swap == 'C') {
        			cup = 1;
        		}else {
        			
        		}
        	}
        	
        }
        
        System.out.println(cup);
        
        scan.close();
    }

}