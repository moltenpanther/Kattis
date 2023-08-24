import java.util.Scanner;

public class slatkisi {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	double candy = scan.nextInt();
    	int zeroes = scan.nextInt();
    	double tens = Math.pow(10, zeroes);
    	
    	candy /= tens;
    	candy = Math.round(candy);
    	candy *= tens;
    	
    	System.out.println((int)(candy));
    	
    	
    	
    	scan.close();
    	
    }

}
