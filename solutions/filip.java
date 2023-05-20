import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	String num1 = scan.next();
    	String num2 = scan.next();
    	
    	char c1 = num1.charAt(0);
    	char c2 = num1.charAt(1);
    	char c3 = num1.charAt(2);
    	char c4 = num2.charAt(0);
    	char c5 = num2.charAt(1);
    	char c6 = num2.charAt(2);	
    	
    	//Last digit check
	    	if(c3 > c6) {
	        	System.out.print(c3);
	        	System.out.print(c2);
	        	System.out.print(c1);
	    	}else if(c6 > c3){
	        	System.out.print(c6);
	        	System.out.print(c5);
	        	System.out.print(c4);
	    	}else {
		   
	    	//Middle digit check
	    		if(c2 > c5) {
		        	System.out.print(c3);
		        	System.out.print(c2);
		        	System.out.print(c1);
		    	}else if(c5 > c2){
		        	System.out.print(c6);
		        	System.out.print(c5);
		        	System.out.print(c4);
		    	}else {
			    	
		    	//First digit check
		    		if(c1 > c4) {
			        	System.out.print(c3);
			        	System.out.print(c2);
			        	System.out.print(c1);
			    	}else{
			        	System.out.print(c6);
			        	System.out.print(c5);
			        	System.out.print(c4);
			    	}
		    	}

	    	}

        scan.close();
    }
}