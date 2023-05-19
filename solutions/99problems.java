import java.util.Scanner;

public class Kattis {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int ans = 0;
        
        if(num < 99) {
            ans = 99;
        }else if(num > 9999) {
            ans = 9999;
        }else {
            
            int rem = num % 100;
            if(rem > 48) {
                
                num += (99 - rem);
            }else {
                num -= (rem + 1);
            }
            
            ans = num;
        }
        
        System.out.println(ans);
        
        scan.close();
    }
    
}
