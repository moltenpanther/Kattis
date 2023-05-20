import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = 0;
        int count = 10;
        int rem = 0;
        int[] mod = new int[10];
        
        for(int i = 0; i < 10; i++) {
        	
        	num = scan.nextInt();
        	rem = num % 42;
        	mod[i] = rem;
        }
        
        for(int i = 0; i < 10; i++) {
        	        	
        	for(int j = i + 1; j < 10; j++) {
        		
        		if(mod[i] == mod[j]) {
        			count--;
        			j = 10;
        		}
        		
        	}
       
        }
        
        System.out.println(count);
        scan.close();
    }

}