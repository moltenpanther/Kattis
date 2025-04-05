import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class lidaskipting {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        BigInteger num = new BigInteger(br.readLine());
        
        // Output
        if(num.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
            sb.append("Jebb");
        } else {
            sb.append("Neibb");
        }

        System.out.println(sb);
        
        br.close();
    }

}
