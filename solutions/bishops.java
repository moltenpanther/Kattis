import java.util.Scanner;

public class bishops {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	while(scan.hasNext()) {
    		
    		int num = scan.nextInt();
    	
	    	// Output
    		if(num == 1) {
    			System.out.println(1);
    		}else {
    			System.out.println(num * 2 - 2);    			
    		}
	    }
    	
    	scan.close();
    	
    }

}
