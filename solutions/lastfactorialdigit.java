import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	int cases = scanner.nextInt();
    	int count = 0;
    	int num = 0;
    	int numCount = 1;
    	int facto = 0;
    	
    	while(count != cases) {
    		count += 1;
    		num = scanner.nextInt();
    		facto = num;
    			//sub-while to calculate factorial
    			while(numCount != num) {
    				facto *= numCount;
    				numCount += 1;
    			}
    		//back to main-while to detect last char
    		numCount = 1;
    		
    		String factorial = String.valueOf(facto);
    		char last = factorial.charAt(factorial.length()-1);	
    		
    		System.out.println(last);
    	}
    	
    	scanner.close();
    }		

}