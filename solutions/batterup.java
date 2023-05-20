import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	double atBats = scan.nextInt();
    	double bases = 0;
    	double denom = 0;
    	double sum = 0;
    	double count = 0;
    	double stat = 0;
    	
    	for(int i = 1; i <= atBats; i ++) {
    		bases = scan.nextInt();
    			
    			if(bases >= 0) {
    				sum += bases;
    				count ++;
    			}else {}
    		
    	}
    	
    	stat = sum / count;
    	System.out.println(stat);
    	
        scan.close();
    }
}