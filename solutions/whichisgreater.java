import java.util.Scanner;

public class whichisgreater{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        if(num1 <= num2){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
        
    }
    
}