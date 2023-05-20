import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        
        if(a + b == c) {
        	System.out.println("correct!");
        }else {
        	System.out.println("wrong!");
        }
        
        
        
        scan.close();
    }
    
}