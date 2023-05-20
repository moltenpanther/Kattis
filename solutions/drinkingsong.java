import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();        
        String drink = scan.next();
        
        for(int i = num; i > 0; i--) {
        	
        	if(i > 1) {
        		System.out.println(i + " bottles of " + drink + " on the wall, " + i + " bottles of " + drink + ".");
        	}else {
        		System.out.println(i + " bottle of " + drink + " on the wall, " + i + " bottle of " + drink + ".");
        	}
        	
        	if(i > 2) {
        		System.out.println("Take one down, pass it around, " + (i - 1) + " bottles of " + drink + " on the wall.");        		
        	}else if(i == 2) {
        		System.out.println("Take one down, pass it around, " + (i - 1) + " bottle of " + drink + " on the wall.");        			
        	}else {
        		System.out.println("Take it down, pass it around, no more bottles of " + drink + ".");
        	}
        	System.out.println();        	
        	
        }
        
        
        scan.close();
        
	}

}
