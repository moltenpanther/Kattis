import java.util.Scanner;

public class Kattis{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int disp = scan.nextInt();
        
        for(int i = 0; i < num; i++) {
        	
        	if((i + 1) % disp == 0) {
        		System.out.print(scan.nextInt() + " ");        		
        	}else {
        		scan.nextInt();        		
        	}
      
        }
        
        scan.close();
    }  
}