import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            
        String num = "";
        int length = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        while(!num.equals("0")) {
        
        	num = scan.next();
        	length = num.length();
        	sum1 = 0;
        	
        	for(int i = 0; i < length; i++) {
        		sum1 += Character.getNumericValue(num.charAt(i));	
        	}
                	
        	int count = 11;
        	String check = "";
        	
        	while(sum1 != sum2) {
        		
        		check = String.valueOf(Integer.valueOf(num) * count);	
        		sum2 = 0;
            	count++;

            	for(int i = 0; i < check.length(); i++) {
            		sum2 += Character.getNumericValue(check.charAt(i));	
            	}    
        	}
        	
    		sum2 = 0;
        	
        	if(!num.equals("0")) {
        	System.out.println(count - 1);
        	}
        }
        
        scan.close();
        
    }

}