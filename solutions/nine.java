import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class nine {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        BigInteger mod = BigInteger.valueOf(1000000007);

        for(int i = 0; i < num; i++) {
            
            long len = Long.parseLong(br.readLine()) - 1;
            
            BigInteger pow = BigInteger.valueOf(len);
            BigInteger ans = BigInteger.valueOf(9);
            
            ans = ans.modPow(pow, mod);
            ans = ans.multiply(BigInteger.valueOf(8));
            ans = ans.mod(mod);
            
            // Output
            System.out.println(ans);
        }
        
        br.close();
    }

}
