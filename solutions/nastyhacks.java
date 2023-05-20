import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	int cases = scanner.nextInt();
    	int count = 0;
    	
    	while(count != cases) {
    		count += 1;
    	
    		int noAds = scanner.nextInt();
    		int withAds = scanner.nextInt();
    		int costAds = scanner.nextInt();
    	
    		if(costAds + noAds < withAds) {
    			System.out.println("advertise");
    		}else if(costAds + noAds > withAds) {
    			System.out.println("do not advertise");
    		}else if(costAds + noAds == withAds) {
    			System.out.println("does not matter");
    		}
    		//No clue why I was overthinking this so much
    	}	scanner.close();
    }		

}