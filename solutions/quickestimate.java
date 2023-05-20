import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	
    	for(int i = 1; i <= n; i++) {
    		String cost = scan.next();
    		System.out.println(cost.length());
    	}
    		
    	scan.close();
    }
}