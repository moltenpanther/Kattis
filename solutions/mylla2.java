import java.util.Scanner;

public class mylla2 {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	String row1 = scan.next();
    	String row2 = scan.next();
    	String row3 = scan.next();
    	
    	boolean jebb = false;
    	// Acrosses
    	if(row1.equals("OOO") || row2.equals("OOO") || row3.equals("OOO")) {
    		jebb = true;
    	}
    	
    	// Downs
    	if(row1.charAt(0) == 'O' && row2.charAt(0) == 'O'  && row3.charAt(0) == 'O' ) {
    		jebb = true;
    	}
    	if(row1.charAt(1) == 'O' && row2.charAt(1) == 'O'  && row3.charAt(1) == 'O' ) {
    		jebb = true;
    	}
    	if(row1.charAt(2) == 'O' && row2.charAt(2) == 'O'  && row3.charAt(2) == 'O' ) {
    		jebb = true;
    	}
    	
    	// Diagonals
    	if(row1.charAt(0) == 'O' && row2.charAt(1) == 'O'  && row3.charAt(2) == 'O' ) {
    		jebb = true;
    	}
    	if(row3.charAt(0) == 'O' && row2.charAt(1) == 'O'  && row1.charAt(2) == 'O' ) {
    		jebb = true;
    	}
    	
    	
    	// Acrosses
    	if(row1.equals("XXX") || row2.equals("XXX") || row3.equals("XXX")) {
    		jebb = false;
    	}
    	
    	// Downs
    	if(row1.charAt(0) == 'X' && row2.charAt(0) == 'X'  && row3.charAt(0) == 'X' ) {
    		jebb = false;
    	}
    	if(row1.charAt(1) == 'X' && row2.charAt(1) == 'X'  && row3.charAt(1) == 'X' ) {
    		jebb = false;
    	}
    	if(row1.charAt(2) == 'X' && row2.charAt(2) == 'X'  && row3.charAt(2) == 'X' ) {
    		jebb = false;
    	}
    	
    	// Diagonals
    	if(row1.charAt(0) == 'X' && row2.charAt(1) == 'X'  && row3.charAt(2) == 'X' ) {
    		jebb = false;
    	}
    	if(row3.charAt(0) == 'X' && row2.charAt(1) == 'X'  && row1.charAt(2) == 'X' ) {
    		jebb = false;
    	}
    	
    	    	
    	
    	// Output
    	if(jebb) {
    		System.out.println("Jebb");    		
    	}else {
    		System.out.println("Neibb");
    	}
    	
   		
    	scan.close();
    }

}
