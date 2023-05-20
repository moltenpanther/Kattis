import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String input = scan.nextLine();
        String ans = "";
        
        for(int i = 0; i < input.length() - 1; i++) {
        	
        	char letter = input.charAt(i);
        	char next = input.charAt(i + 1);
        	if(letter != next) {
        		ans += letter;
        	}
        }
        
        System.out.println(ans + input.charAt(input.length() - 1));
        
        scan.close();
    }
    
}