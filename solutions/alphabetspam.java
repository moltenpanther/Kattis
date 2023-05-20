import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String in = scan.next();
        double length = in.length();
        double under = 0;
        double lower = 0;
        double upper = 0;
        double symbo = 0;
        double total = 0;
        
        for(int i = 0; i < length; i++) {
        	
        	char check = in.charAt(i);
        	
        	if(check == '_') {
        		under++;
        	}else if(check >= 97 && check <= 122) {
        		lower++;
        	}else if(check >= 65 && check <= 90) {
        		upper++;
        	}else {
        		symbo++;
        	}
        }
        
        total = under + lower + upper + symbo;
        
        System.out.println(under / total);
        System.out.println(lower / total);
        System.out.println(upper / total);
        System.out.println(symbo / total);

        
        scan.close();
        
    }

}