import java.util.Scanner;

public class jazzitup {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        long num = scan.nextInt();
        if(Math.pow(Math.floor(Math.sqrt(num)), 2) != num){
                        
            long ans = 2;
            boolean square = true;
            while(square && ans < num) {
                
                long mn = ans * num;
                
                square = false;
                for(long i = 2; i < mn; i++) {   
                    if(mn % (i * i) == 0) {
                        i = mn;
                        square = true;
                    }
                }
                
                if(square) {
                    ans++;              
                }
            }
            
            System.out.println(ans);
        } 
        
        scan.close();
        
    }

}
