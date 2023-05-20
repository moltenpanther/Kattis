import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int rot = scan.nextInt();
        int fin = scan.nextInt();
        
        boolean up = true;
        
        if((fin / rot) % 2  == 1){
        	up = false;
        }
        
        if(fin % rot > rot / 2) {
        	up = !up;
        }
        
        if(up) {
        	System.out.println("up");
        }else {
        	System.out.println("down");
        }
        
        scan.close();
    }    
    
}