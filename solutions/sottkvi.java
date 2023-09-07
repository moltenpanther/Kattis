import java.util.Scanner;

public class sottkvi {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	    	
    	int num = scan.nextInt();
    	int daysUntil = scan.nextInt();
    	int today = scan.nextInt();
    	
    	int bday = today + daysUntil;
    	
    	int count = 0;
    	for(int i = 0; i < num; i++) {
    		int quar = scan.nextInt();
    		if(quar + 14 <= bday) {
    			count++;
    		}
    	}
    	
    	// Output
    	System.out.println(count);
   		
    	scan.close();
    }

}
