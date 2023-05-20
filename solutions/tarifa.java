import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	int maxMegs = scanner.nextInt();
    	int months = scanner.nextInt();
    	int megabytes = 0;
    	int count = 0;
    	
    	while(count != months){
    		count += 1;
    		int usage = scanner.nextInt();
    		megabytes += maxMegs - usage;
    	}
    	
    	System.out.println(megabytes + maxMegs);
    	
    	scanner.close();
    	
    }
    

}