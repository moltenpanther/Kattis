import java.util.Scanner;

public class timeloop{
    
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);    
        
        int num = scan.nextInt();
        
        for(int i = 1; i <= num; i++){
            
            System.out.println(i + " Abracadabra");
            
        }
    }
    
}