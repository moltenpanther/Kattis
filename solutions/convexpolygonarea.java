import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i = 0; i < num; i++) {
        	
        	int sides = scan.nextInt();
        	int[] x = new int[sides];
        	int[] y = new int[sides];
        	
        	for(int j = 0; j < sides; j++) {
        		
        		x[j] = scan.nextInt();
        		y[j] = scan.nextInt();
        	}
        	
        	
        	double sum = 0;
        	for(int j = 0; j < sides; j++) {
        		
        		int xPrev = x[sides - 1];
        		if(j > 0) {
        			xPrev = x[j - 1];
        		}
        		
        		int xNext = x[(j + 1) % sides];
        		sum += y[j] * (xPrev - xNext);
        		
        	}
        	
        	sum /= 2;
        	
        	System.out.println(sum);
        }
        
        scan.close();
    }
    
}
