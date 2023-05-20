import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int hour = scan.nextInt();
    	int min = scan.nextInt();
    	int dif = min - 45;
    	
    	if(dif < 0) {
    		dif = 60 + dif;
    		hour--;
    		if(hour < 0) {
    			hour = 23;
    		}
    	}else {}
    	
    	System.out.print(hour + " ");
    	System.out.print(dif);
    	
    	scan.close();
    }
}