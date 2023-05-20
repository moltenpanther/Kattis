import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int num = scan.nextInt();
    	int temp = 0;
    	int count = 0;
    	
    		for(int i = 1; i <= num; i++) {
    			temp = scan.nextInt();
    				
    			if(temp < 0) {
    				count ++;
    			}else {}
    		}
    		
    		System.out.println(count);
    		
        scan.close();
    }
}