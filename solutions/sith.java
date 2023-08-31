import java.util.Scanner;

public class sith {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	scan.nextLine();
    	int a = Integer.parseInt(scan.nextLine());
    	int b = Integer.parseInt(scan.nextLine());
    	int ab = Integer.parseInt(scan.nextLine());
    	
    	int abTrue = a - b;
    	
        // Output
    	if(ab < 0) {
    		System.out.println("JEDI");
    	}else {    		
    		if(abTrue != ab) {
    			System.out.println("SITH");
    		}else {
    			System.out.println("VEIT EKKI");    		    			
    		}
    	}
    	 
        scan.close();
    }

}
