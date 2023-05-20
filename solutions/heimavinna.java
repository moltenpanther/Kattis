import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String problems = scan.next() + ";";
        
        int length = problems.length();
        int colon = 0;
        int dash = 0;
        int colon1 = -1;
        int colon2 = 0;
        int pre = 0;
        int post = 0;
        int dif = 0;

        for(int i = 0; i < length; i++) {
        	
        	char check = problems.charAt(i);
        	if(check == ';') {
        		colon++;
        		colon2 = i;
            	String sub = problems.substring(colon1 + 1, colon2);
            	colon1 = colon2;
            	
            	if(sub.contains("-")) {
            		dash = sub.indexOf("-");
            		pre = Integer.valueOf(sub.substring(0, dash));
            		post = Integer.valueOf(sub.substring(dash + 1, sub.length()));
            		dif += post - pre;
            	}
            	
        	}
        	        	
        }	
   
        System.out.println(colon +  dif);
        scan.close();
    }

}