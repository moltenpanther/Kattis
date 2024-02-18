import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primereduction {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        while(num != 4) {
            
            // Tracking for output
            int count = 1;
            
            boolean prime = false;
            while(!prime) {
                
                int sqrt = (int)Math.sqrt(num);
                if(num != 2) {
                                        
                    // Loop through divisors
                    int sum = 0;
                    int div = 2;
                    boolean maybePrime = true;
                    while(num > 1 && div <= sqrt) {
                        
                        // Factoring num by primes
                        while(num % div == 0) {
                            num /= div;
                            sum += div;
                            maybePrime = false;
                        }
                        
                        div++;
                    }
                    
                    if(maybePrime) {
                        prime = true;
                    }else {
                        if(num == 1) {
                            num--;
                        }
                        num = sum + num;
                        count++;
                    }
                    
                }else {
                    prime = true;
                }
            }
            sb.append(num + " ");
            sb.append(count + "\n");
            num = Integer.parseInt(br.readLine());
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

    public static boolean checkPrime(int num) {
                
        if(num == 2) {
            return true;
        }
        
        if(num % 2 == 0) {
            return false;
        }
        
        double sqrt = Math.sqrt(num);
        for(int i = 3; i <= sqrt; i += 2) {
            if(num % i == 0) {
                return false;
            }
        }
          
        return true;
    }
    
}
