import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class catalansquare {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine()) + 1;
        
        BigInteger botL = BigInteger.ONE;
        BigInteger botR = BigInteger.ONE;
        
        BigInteger fact = BigInteger.ONE;
        for(int i = 1; i <= 2 * num; i++) {
            
            fact = fact.multiply(BigInteger.valueOf(i));
            
            if(i == num) {
                botL = fact;
            }else if(i == num + 1) {
                botR = fact;
            }
            
        }
                
        BigInteger Cn = fact.divide(botL.multiply(botR));
        System.out.println(Cn);
        
        br.close();
    }

}

