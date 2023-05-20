import java.util.Scanner;

public class gcvwr{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int gcvwr = scan.nextInt();
        int weight = scan.nextInt();
        int num = scan.nextInt();
        
        int itemWeight = 0;
        
        for(int i = 0; i < num; i++){
            
            itemWeight += scan.nextInt();
            
        }
        
        int towWeight = ((gcvwr - weight) / 10) * 9;
        
        System.out.println(towWeight - itemWeight);
        
    }
    
}