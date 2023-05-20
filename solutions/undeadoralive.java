import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String input = scan.nextLine();
        
        boolean smile = false;
        boolean frown = false;
        
        if(input.contains(":)")) {
        	smile = true;
        }
        if(input.contains(":(")){
        	frown = true;
        }
        
        if(smile && frown) {
        	System.out.println("double agent");
        }else if(smile) {
        	System.out.println("alive");
        }else if(frown) {
        	System.out.println("undead");
        }else {
        	System.out.println("machine");
        }
        
        scan.close();
    }
    
}