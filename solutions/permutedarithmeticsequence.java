import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i = 0; i < num; i++) {
        	
        	boolean sorted = false;
        	boolean sameDif = true;
        	
        	int num2 = scan.nextInt();
        	int[] vals = new int[num2];
        	
        	for(int j = 0; j < num2; j++) {
        		vals[j] = scan.nextInt();
        	}
        	
        	int dif = vals[0] - vals[1];
        	for(int j = 1; j < num2 - 1; j++) {
        		if(dif != vals[j] - vals[j + 1]) {
        			sameDif = false;
        			j = num;
        		}
        	}
        	
        	Arrays.sort(vals);
        	if(!sameDif) {
        		sameDif = true;
        		dif = vals[0] - vals[1];
        		for(int j = 1; j < num2 - 1; j++) {
            		if(dif != vals[j] - vals[j + 1]) {
            			sameDif = false;
            			j = num;
            		}
        		}
        		if(sameDif) {
        			sorted = true;
        		}
        	}
        	
        	if(!sameDif) {
        		System.out.println("non-arithmetic");
        	}else if(sorted) {
        		System.out.println("permuted arithmetic");
        	}else {
        		System.out.println("arithmetic");
        	}
        	
        }
        
        scan.close();
    }    
	
}
