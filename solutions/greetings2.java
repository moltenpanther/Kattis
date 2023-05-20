import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	String hey = scanner.next();
    	int count = 0;
    	int eLength = 0;
    	
    	eLength = (hey.length() - 2) * 2;
    	
    	//Time to make hey    	
    	System.out.print('h');
    	while(count != eLength) {
    		System.out.print('e');
    		count += 1;
    	}
    	System.out.print('y');
    	
    	scanner.close();
    }		

}