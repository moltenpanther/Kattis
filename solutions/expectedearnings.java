import java.util.Scanner;

public class expectedearnings {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int prize = scan.nextInt();
    	int cost = scan.nextInt();
    	double prob = scan.nextDouble();
    	
    	double expVal = prob * (prize - cost) + (1 - prob) * -cost;
    	    	
    	if(expVal < 0) {
    		System.out.println("spela");
    	}else {
    		System.out.println("spela inte!");
    	}
    	
    	scan.close();
    	
    }

}
