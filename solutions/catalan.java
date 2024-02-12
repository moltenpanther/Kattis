import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class catalan {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        
        BigInteger[] list = new BigInteger[5001];
        list[0] = BigInteger.ONE;
        
        // Pre-processing
        for(int i = 1; i <= 5000; i++) {
            
            BigInteger prev = list[i - 1];
            BigInteger nom = BigInteger.valueOf(4 * i - 2);
            BigInteger denom = BigInteger.valueOf(i + 1);
            
            BigInteger frac = nom.multiply(prev);
            frac = frac.divide(denom);
            
            list[i] = frac;
        }

        // Checking the list
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++) {
            int check = Integer.parseInt(br.readLine());
            sb.append(list[check] + "\n");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }
    
}
