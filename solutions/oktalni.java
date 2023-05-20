import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String num = scan.next();
        
        int rem = num.length() % 3;
        for(int i = 0; i < 3 - rem; i++) {
            num = "0" + num;
        }
                
        String ans = "";
        for(int i = 0; i < num.length(); i += 3) {
            
        	String three = num.substring(i, i + 3);
            
        	int sub = 0;
            
            if(Integer.parseInt(three.substring(0, 1)) == 1) {
            	sub += 4;
            }
            if(Integer.parseInt(three.substring(1, 2)) == 1) {
            	sub += 2;
            }
            if(Integer.parseInt(three.substring(2)) == 1) {
            	sub += 1;
            }
            
            ans += sub + "";
        }
        
        int notZero = 0;
        for(int i = 0; i < ans.length(); i++) {
        	
        	if(ans.charAt(i) != '0') {
        		notZero = i;
        		i = ans.length();
        	}
        }
        
        System.out.println(ans.substring(notZero));
        
        
        scan.close();
    }
    
}
