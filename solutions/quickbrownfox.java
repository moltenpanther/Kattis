import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String[] alphabet = {"a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p" , "q" , "r" , "s" , "t" , "u" , "v" , "w" , "x" , "y" , "z"};
        
        int num = Integer.valueOf(scan.nextLine());
        
        for(int i = 0; i < num; i++) {
        
        	String ans = "missing ";
        	String phrase = scan.nextLine().toLowerCase(); 
        	
        	for(int j = 0; j < 26; j++) {
            	
            	if(phrase.contains(alphabet[j])) {
            		
            	}else {
            		ans += alphabet[j];            		
            	}
            }
        	if(ans.length() == 8) {
        		ans = "pangram";
        	}
        	
        	System.out.println(ans);
        }
        
        scan.close();
        
    }

}