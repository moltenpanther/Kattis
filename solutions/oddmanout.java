import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int cases = scan.nextInt();
        
        for(int i = 1; i <= cases; i++) {
        	
        	int guests = scan.nextInt();
        	String[] code = new String[guests];
        	
        	for(int j = 0; j < guests; j++) {
        		code[j] = scan.next();
        	}
        	
        	for(int j = 0; j < guests; j++) {
        		int count = 0;
        		
        		for(int k = 0; k < guests; k++) {
        			if(j != k) {        			
	        			if(code[j].equals(code[k])) {
	        				count++;
	        			}
        			}
        		}
        		
        		if(count == 0) {
        			System.out.println("Case #" + i + ": " + code[j]);
        			j = guests + 1;
        		}	
        	}	
        }
        
        scan.close();
    }

}