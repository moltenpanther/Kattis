import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class olderbrother {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean good = false;
        int num = Integer.parseInt(br.readLine());
        
        if(!checkPrime(num)) {
            
            for(int i = 2; i <= Math.sqrt(num); i++) {
    
                if(checkPrime(i)) {
                    int check = num;
                    while(check % i == 0 && check > 0) {    
                        check /= i;
                        if(check == 1) {
                            good = true;
                            i = num + 1;
                            break;
                        }
                    }   
                }   
            }
        }else if(num == 1){
            good = false;
        }else {
            good = true;
        }
        
        
        
        // Output
        if(good) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        
        br.close();
    }
    
    public static boolean checkPrime(int num) {
        
        double sqrt = Math.sqrt(num);
        for(int i = 2; i <= sqrt; i++) {
            if(num % i == 0) {
            return false;
            }
        }
          
        return true;
    }

}

