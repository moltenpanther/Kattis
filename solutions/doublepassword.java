import java.util.Scanner;

public class doublepassword{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String pass1 = scan.next();
        String pass2 = scan.next();
        
        int comb = 1;
        
        for(int i = 0; i < pass1.length(); i++){
            
            if(pass1.charAt(i) != pass2.charAt(i)){
                comb *= 2;
            }
        }
        
        System.out.println(comb);
        
    }
    
}