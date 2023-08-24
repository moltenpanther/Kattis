import java.util.Scanner;

public class overdraft {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int transactions = scan.nextInt();
    	
    	int totalNeeded = 0;
    	int bank = 0;
    	for(int i = 0; i < transactions; i++) {
    		
    		bank += scan.nextInt();
    		if(bank < 0) {
    			totalNeeded += bank;
    			bank -= bank;
    		}
    	}
    	
    	System.out.println(totalNeeded * -1);
    	
    	scan.close();
    	
    }

}
