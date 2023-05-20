import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int cases = scan.nextInt();
    	int k = 0;
    	int candles = 0;
    	int sum = 0;
    	
    		for(int i = 1; i <= cases; i++) {
    			sum = 0;
    			k = scan.nextInt();
    			candles = scan.nextInt() + 1;
    			
    				for(int j = 2; j <= candles; j++) {
    					sum += j;
    				}
    			System.out.print(k + " ");
    			System.out.print(sum); 	
    			System.out.println();
    			
    		}
    	
        scan.close();
    }
}