import java.util.Hashtable;
import java.util.Scanner;

public class monopol {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	Hashtable<Integer, Double> hash = new Hashtable<Integer, Double>();
    	
    	hash.put(2, (double) 1/36);
    	hash.put(3, (double) 2/36);
    	hash.put(4, (double) 3/36);
    	hash.put(5, (double) 4/36);
    	hash.put(6, (double) 5/36);
    	hash.put(7, (double) 6/36);
    	hash.put(8, (double) 5/36);
    	hash.put(9, (double) 4/36);
    	hash.put(10, (double) 3/36);
    	hash.put(11, (double) 2/36);
    	hash.put(12, (double) 1/36);
    	
    	int hotels = scan.nextInt();
    	
    	double sum = 0;
    	for(int i = 0; i < hotels; i++) {
    		int num = scan.nextInt();
    		sum += hash.get(num);
    	}
    	
    	System.out.println(sum);
    	
    	scan.close();
    	
    }

}
