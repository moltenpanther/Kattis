import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class anothercandies {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cases = Integer.parseInt(br.readLine());
        for(int h = 0; h < cases; h++) {
            br.readLine();
            
            int num = Integer.parseInt(br.readLine());
            BigInteger numBig = new BigInteger(num + "");
            
            BigInteger sum = BigInteger.ZERO;
            for(int i = 0; i < num; i++) {
                BigInteger candy = new BigInteger(br.readLine());
                sum = sum.add(candy);
            }
            
            // Output
            if(sum.mod(numBig) == BigInteger.ZERO) {
                System.out.println("YES");              
            }else {
                System.out.println("NO");               
            }
            
        }
        
        br.close();
    }

}
