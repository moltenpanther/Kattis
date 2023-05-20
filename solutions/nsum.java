import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int sum = 0;
        
        for(int i = 0; i < num; i++) {
        	sum += scan.nextInt();
        }
        
        System.out.println(sum);
    }
}