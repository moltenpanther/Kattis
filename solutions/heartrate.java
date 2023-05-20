import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	int cases = scanner.nextInt();
    	int count = 0;
    	int beats = 0;
    	float sec = 0;
    	float bpm = 0;
    	double dif = 0.0000;
    	
    	while(count != cases) {
    		count += 1;
    		beats = scanner.nextInt();
    		sec = scanner.nextFloat();
    		
    		bpm = 60 * beats / sec;
    		dif = 60 / sec;
    		
    		System.out.printf("%.4f ", bpm - dif);
    		System.out.printf("%.4f ", bpm);
    		System.out.printf("%.4f ", bpm + dif);
    		
    	}
    	
    	scanner.close();
    }		

}