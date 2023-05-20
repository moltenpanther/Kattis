import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String x = scan.next();
        String code = scan.next() + "";
        int length = code.length();
        int count = 1;
        int num = 0;
        char check;
        char next;
        String ans = "";
        
        if(x.equals("E")) {
	        for(int i = 0; i < length; i++) {
	        	check = code.charAt(i);
	        	
	        	if(i != length - 1) {
	            	next = code.charAt(i + 1);
	            	
		        	if(check == next) {
		        		count++;
		        	}else {
		        		ans += ((check + "") + count);
		        		count = 1;
		        	}
		        	
	        	}else {
	        		ans += ((check + "") + count);
	        	}
	        	
	        }
	        System.out.println(ans);
	        
        }else {
        	for(int i = 0; i < length; i += 2) {
        		check = code.charAt(i);
        		num = Character.getNumericValue(code.charAt(i + 1));
        		
        		for(int j = 1; j <= num; j++) {
        			ans += (check + "");
        		}
        		
        	}
        	System.out.println(ans);
        }   
        scan.close();
    }

}
