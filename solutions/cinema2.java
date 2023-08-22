import java.util.Scanner;

public class cinema2 {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int seats = scan.nextInt();
    	int groups = scan.nextInt();
    	
    	int left = groups;
    	for(int i = 0; i < groups; i++) {
    		
    		int num = scan.nextInt();
    		if(num <= seats) {
    			seats -= num;
    			left--;
    		}else {
    			i = groups;
    		}
    		
    	}
    	
    	System.out.println(left);
    	
    	scan.close();
    	
    }

}
