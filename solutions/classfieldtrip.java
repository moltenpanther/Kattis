import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        char[] array = (scan.next() + scan.next()).toCharArray();
        
        Arrays.sort(array);
        
        for(char x : array) {
        	System.out.print(x);
        }
        
        scan.close();
        
	}

}
