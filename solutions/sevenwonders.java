import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String cards = scan.next();
        int length = cards.length();
        int t = 0;
        int c = 0;
        int g = 0;
        int set = 0;
        
        for(int i = 0; i < length; i++) {
        	
        	char check = cards.charAt(i);
        	
        	if(check == 'T') {
        		t++;
        	}else if(check == 'C') {
        		c++;
        	}else {
        		g++;
        	}
        }
        
        if(t <= c && t <= g) {
        	set = t;
        }else if(c <= t && c <= g) {
        	set = c;
        }else if(g <= c && g <= t){
        	set = g;
        }
        
        double ans = t * t + c * c + g * g + (7 * set);
        		
        System.out.printf("%.0f", ans);
        
        scan.close();
    }

}