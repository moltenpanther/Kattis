import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] num1 = new int[4];
        int[] num2 = new int[3];
        int max = 0;
        int min = 100;
        int k = 0;
        int skip = 0;
        
        for(int i = 0; i < 4; i++) {
        	num1[i] = scan.nextInt();
        }
        
        for(int i = 0; i < 4; i++) {
        	for(int j = 0; j < 4; j++) {
            	if(num1[i] >= num1[j] && num1[i] > max) {
            		max = num1[i];
            		skip = i;
            	}
        	}        	
        }      
        
        for(int i = 0; i < 4; i++) {
        	
        	if(i != skip) {
        	num2[k] = num1[i];
        	k++;
        	}
        } 
        
        max = 0;
        
        for(int i = 0; i < 3; i++) {
        	
        	for(int j = 0; j < 3; j++) {
        		
            	if(num2[i] >= num2[j] && num2[i] > max) {
            		max = num2[i];
            	}
        	}        	
        }
        
        for(int i = 0; i < 3; i++) {
        	
        	for(int j = 0; j < 3; j++) {
        		
            	if(num2[i] <= num2[j] && num2[i] < min) {
            		min = num2[i];
            	}
        	}        	
        }
        
        System.out.println(min * max);
        scan.close();
    }

}