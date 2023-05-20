import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int sum = 0;
    	int bestScore = 0;
    	int con = 0;    			
    	
    	for(int i = 1; i <= 5; i++) {
    		for(int j = 1; j <= 4; j++) {
    			int score = scan.nextInt();
    			sum += score;	
    		if(sum > bestScore) {
    			bestScore = sum;
    			con = i;
    		}else {}
    		}
    		
    	 sum = 0;
    	}
    	
    	System.out.print(con + " ");
    	System.out.print(bestScore);
    	
    	scan.close();
    }
}