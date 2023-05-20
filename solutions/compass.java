import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        if(num1 != num2) {        	
	        int left;
	        if(num1 < num2){
	        	left = (360 - num2) + num1;
	        }else{
	        	left = num1 - num2;
	        }
	
	        int right;
	        if(num2 < num1){
	        	right = (360 - num1) + num2;
	        }else{
	        	right = num2 - num1;
	        }
	        
	        if(left < right) {
	        	System.out.println(left * -1);
	        }else if(right < left) {
	        	System.out.println(right);
	        }else {
	        	System.out.println(180);
	        }
        }else {
        	System.out.println(0);
        }
        
        scan.close();
    }
    
}
