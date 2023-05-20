import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	int periods = scanner.nextInt();
    	int count = 0;
    	double totalQALY = 0.0;
    	
    	while(count != periods){
    		count += 1;
    		double quality = scanner.nextDouble();
    		double years = scanner.nextDouble();
    		totalQALY += quality * years;
    	
    	}
    	
    	System.out.println(totalQALY);
    	
    	scanner.close();
    	
    }
    

}