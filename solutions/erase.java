import java.util.Scanner;
public class Kattis{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        String start = scan.next();
        String end = scan.next();
        boolean match = true;
        
        if(num % 2 == 0){
            if(!start.equals(end)){
                match = false;
            }
        }else{
            for(int i = 0; i < start.length(); i++){
                if(start.charAt(i) == end.charAt(i)){
                    i = start.length();
                    match = false;
                }
            }
        }
        
        if(match){
            System.out.println("Deletion succeeded");
        }else{
            System.out.println("Deletion failed");
        }
        
    }
    
}