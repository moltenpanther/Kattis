import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class multiplications {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger total = BigInteger.ONE;
        BigInteger mod = BigInteger.valueOf(1000000007);
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            BigInteger mult = BigInteger.valueOf(Long.parseLong(br.readLine()));
            total = total.multiply(mult);
            total = total.mod(mod);
        }
        
        // Output
        System.out.println(total);
        
        br.close();
    }

}
