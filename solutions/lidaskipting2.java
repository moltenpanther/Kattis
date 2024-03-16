import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class lidaskipting2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger num = new BigInteger(br.readLine());
        BigInteger three = BigInteger.valueOf(3);
        
        BigInteger div = num.divide(three);
        if(!num.mod(three).equals(BigInteger.ZERO)) {
            div = div.add(BigInteger.ONE);
        }
        
        // Output
        System.out.println(num);
        System.out.println(div);
        
        br.close();
    }

}
