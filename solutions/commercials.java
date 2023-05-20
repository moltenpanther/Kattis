import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int price = scan.nextInt();
        
        int[] time = new int[num];

        int max = 0;
        for(int i = 0; i < num; i++) {
        	time[i] = scan.nextInt() - price;
        }
         
        int sum = 0;
        for(int i = 0; i < num; i++) {
        	sum += time[i];
        	if(sum > max) {
        		max = sum;
        	}
        	
        	if(sum < 0) {
        		sum = 0;
        	}
        	
        }

        System.out.println(max);
        
        scan.close();
    }    
    
}