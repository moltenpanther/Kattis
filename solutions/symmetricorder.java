import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = 999;
        int count = 1;
        
        while(num != 0) {
        	
        	num = scan.nextInt();
        	String[] names = new String[num]; 
        	int length = names.length;	
        	
        	if(num == 0) {
        		
        	}else {
	        	if(num % 2 == 0) {
		        	for(int i = 0; i < num / 2; i++) {
		        		names[i] = scan.next();
		        		names[length - (i + 1)] = scan.next();
		        	}
		        	System.out.println("SET " + count);
		        	
		        	for(int i = 0; i < num; i++) {
		        		System.out.println(names[i]);	
		        	}
		        	
		        	count++;
		        	
	        	}else {
		        	for(int i = 0; i < num / 2; i++) {
		        		names[i] = scan.next();
		        		names[length - (i + 1)] = scan.next();
		        	}
		        	names[(num / 2)] = scan.next();
	        	
	        		System.out.println("SET " + count);
	
		        	for(int i = 0; i < num; i++) {
		        		System.out.println(names[i]);	
		        	}
		        	count++;
	        	}
        	}
        }
    	
        scan.close();
        
    }

}