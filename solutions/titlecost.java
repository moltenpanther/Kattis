import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String title = scan.next();
        String cap = scan.next();
        
        if(title.length() > Float.valueOf(cap)) {
        	System.out.println(cap);
        }else {
        	System.out.println(title.length());
        }
        
        scan.close();
    }    
    
}