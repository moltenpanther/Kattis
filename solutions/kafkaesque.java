import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        int[] desk = new int[num];
        int[] sorted = new int[num];
        
        for(int i = 0; i < num; i++) {
        	desk[i] = scan.nextInt();
        	sorted[i] = desk[i];
        }
        
        Arrays.sort(sorted);
        
        int i = 0;
        int di = 0;
        int count = 1;
        boolean inLine = true;
        while(inLine) {
        	
        	if(desk[di] == sorted[i]) {
        		di++;
        	}
        	
        	
        	if(di == desk.length) {
        		inLine = false;
        	}else {        		
	        	i++;
	        	if(i == desk.length) {
	        		i = 0;
	        		count++;    
	        	}
        	}
        }
        
        System.out.println(count);
	    
        scan.close();
    }
    
}
