import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int num = scan.nextInt();
    	double ans1 = 0;
    	double ans2 = 0;
    	
    	ans1 = Math.PI * num * num;
    	ans2 = num * num * 2;
    			
    	System.out.println(ans1);
    	System.out.println(ans2);
    	
    	scan.close();
    }
                
}