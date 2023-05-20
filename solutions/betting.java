import java.util.Scanner;

public class betting{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        float num = scan.nextFloat();
        
        float opt1 = 100 / num;
        float opt2 = 100 / (100 - num);
        
        System.out.println(opt1);
        System.out.println(opt2);
        
    }
    
}