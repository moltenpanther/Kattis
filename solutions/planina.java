import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	int iteration = scanner.nextInt();
    	int count = 0;	
    	double total = 0;
    	
    	while(count != iteration) {
    		total += Math.pow(2, iteration - 1);
    		iteration -= 1;
    	
    	}
    	total += 2;
    	total = Math.pow(total, 2);
    	
    	int solution = (int) total;
    	System.out.println(solution);
    	
    	scanner.close();
    }

}