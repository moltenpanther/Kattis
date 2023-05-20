import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = Integer.valueOf(scan.next());
        
        for(int i = 1; i <= num; i++) {
        	
        	String word = scan.next();
        	if(i % 2 != 0) {
        		System.out.println(word);
        	}
        	
        } 
    }
}