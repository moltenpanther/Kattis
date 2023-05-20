import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        int dif1 = num1 - num2;
        int dif2 = num2 - num3;
        
        if(dif1 * dif2 < 0) {
        	System.out.println("turned");
        }else {        
        	
        	dif1 = Math.abs(dif1);
        	dif2 = Math.abs(dif2);
        	
	        if(dif2 == dif1) {
	        	System.out.println("cruised");
	        }else if(dif2 < dif1) {
	        	System.out.println("braked");
	        }else {
	        	System.out.println("accelerated");
	        }
        }
        
        
        scan.close();
    }
    
}
