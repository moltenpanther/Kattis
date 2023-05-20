import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	double num = scan.nextDouble();
    	double ans = num * 1000 * 5280 / 4854;
    	System.out.printf("%.0f", ans);
    	
    	scan.close();
    }
}