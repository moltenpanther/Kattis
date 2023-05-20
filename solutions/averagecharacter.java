import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        char[] input = scan.nextLine().toCharArray();
        
        int sum = 0;
        for(char ch : input) {
        	sum += ch;
        }
        
        sum /= input.length;
        
        System.out.println((char)sum);
        
        scan.close();
    }
    
}
