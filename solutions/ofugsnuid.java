import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int[] num = new int[x];
        
        for(int i = 0; i < x; i++) {
        	
        	num[i] = scan.nextInt();
        }
        
        for(int i = num.length - 1; i >= 0; i--) {
        	
        	System.out.println(num[i]);
        	
        }
        
        scan.close();
    }

}