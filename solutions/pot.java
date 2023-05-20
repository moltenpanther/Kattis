import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);

    	int max = scanner.nextInt();
    	int count = 0;
    	double realNum = 0;
    	double exp = 0;
    	double midMath = 0;
    	double total = 0;
    	
    		while(count != max) {
    			count += 1;
    			
    			String num = scanner.next();
    			String realNumStr = num.substring(0, num.length() - 1);
    			String expStr = num.substring(num.length() - 1);
    			
    			realNum = Integer.valueOf(realNumStr);
    			exp = Integer.valueOf(expStr);
    			
    			midMath = Math.pow(realNum, exp);
    			
    			total += midMath;
    			
    			
    		}
    		
    		int realTotal = (int)total;
    		System.out.println(realTotal);
			
    	scanner.close();
    	
    }
    

}