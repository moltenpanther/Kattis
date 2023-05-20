import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String input = scan.next();
        String[] date = input.split("/");
        
        int date1 = Integer.parseInt(date[0]);
        int date2 = Integer.parseInt(date[1]);
        
        if(date1 < 13 && date2 < 13) {
        	System.out.println("either");
        }else if(date1 < 13) {
        	System.out.println("US");
        }else if(date2 < 13) {
        	System.out.println("EU");
        }
        
        
        scan.close();
    }
    
}