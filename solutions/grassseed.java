import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	double cost = scan.nextDouble();
    	int lawns = scan.nextInt();
        double width = 0.0;
    	double length = 0.0;
    	double sum = 0.0;
    	
    	for(int i = 1; i <= lawns; i++) {
    		width = scan.nextDouble();
    		length = scan.nextDouble();
    		sum += width * length * cost;
    	}
    	
    	System.out.printf("%.7f", sum);
    	
        scan.close();
    }
}