import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class listgame {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        // Loop through divisors
        int div = 2;
        int count = 0;
        int sqrt = (int)Math.sqrt(num);
        while(num > 1 && div <= sqrt) {
            
            // Factoring num by primes
            while(num % div == 0) {
                num /= div;
                count++;
            }
            
            div++;
        }
        
        if(num > 1) {
            count++;
        }

        sb.append(count);
        
        // Output
        System.out.print(sb);
        
        br.close();
    }
    
}
