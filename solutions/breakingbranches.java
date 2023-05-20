import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        if(num % 2 == 0) {
        	System.out.println("Alice\n1");
        }else {
        	System.out.println("Bob");
        }
        
        
        scan.close();
    }
    
}