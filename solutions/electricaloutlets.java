import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int cases = 0;
    	int strips = 0;
    	int sum = 0;
    	
    	cases = scan.nextInt();
    		
    	for(int i = 1; i <= cases; i++) {
    	    	
    		strips = scan.nextInt();
    			  
   				for(int j = 1; j <= strips; j++) {
    					
   					sum += scan.nextInt();

   				}
   				
   			System.out.println(sum - strips + 1);
   			sum = 0;
   			
   			}	
    	
        scan.close();
    }
}