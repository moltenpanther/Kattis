import java.util.Scanner;

public class Kattis{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double num = scan.nextInt();

        double make = scan.nextInt();
        double need = scan.nextInt();
        
        double perc = need / make;
        for(int i = 0; i < num; i++) {
        	
        	int ans = (int) Math.round((scan.nextInt() * perc));
        	System.out.println(ans);
        }

        
        scan.close();
    }  
}