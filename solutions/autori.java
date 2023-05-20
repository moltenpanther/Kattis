import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	String names = scan.next();
    	String check;
    	int ss1 = 0;
    	int ss2 = 1;
    	
    	System.out.print(names.charAt(0));
    	
    	for(int i = 1; i <= names.length(); i++) {
    		check = names.substring(ss1, ss2);
    			
    			if(check.equals("-")) {
    				System.out.print(names.charAt(ss2));
    			}else {}
    		
    		ss1++;
    		ss2++;
    	}
    	
    	scan.close();
    }
}