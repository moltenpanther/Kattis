import java.util.Scanner;

public class countthevowels{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String test = scan.nextLine().toLowerCase();
        int count = 0;
        
        for(int i = 0; i < test.length(); i++){
            
            char check = test.charAt(i);
            if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u'){
                count++;
            }
        }
        
        System.out.println(count);
        
    }
    
}