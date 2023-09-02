import java.util.Scanner;

public class spritt {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	int classes = scan.nextInt();
    	int bottles = scan.nextInt();
    	
    	boolean enough = true;
    	for(int i = 0; i < classes; i++) {
    		   
    		int num = scan.nextInt();
    		bottles -= num;
    		
    		if(bottles < 0) {
    			enough = false;
    		}
    	}
   		
    	// Output
    	if(enough) {
    		System.out.println("Jebb");  		    		
    	}else {
    		System.out.println("Neibb");
    	}
    	
    	scan.close();
    }

}
