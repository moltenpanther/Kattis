import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        long area = scan.nextLong();
        
        double ans = (Math.sqrt(area) * 4);
        System.out.println(ans);
    }
    
}