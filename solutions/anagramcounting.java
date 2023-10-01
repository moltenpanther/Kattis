import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class anagramcounting {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        
        while(inp != null) {
            
            BigInteger top = getFactorial(inp.length());
            int[] letterCount = getLetterCount(inp);
            
            BigInteger bot = BigInteger.valueOf(1);

            for(int num : letterCount) {
                if(num > 1) {
                    BigInteger fact = getFactorial(num);
                    bot = bot.multiply(fact);
                }               
            }
                        
            BigInteger ans = top.divide(bot);
            
            // Output
            System.out.println(ans);
            
            inp = br.readLine();
            
        }
        
        
        br.close();
    }

    private static BigInteger getFactorial(int len) {
        
        BigInteger fact = BigInteger.valueOf(1);
        for(int i = 1; i <= len; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        
        return fact;
    }

    private static int[] getLetterCount(String inp) {
        
        int[] letterCount = new int[52];
        
        for(int i = 0; i < inp.length(); i++) {
            
            char ch = inp.charAt(i);
            if(ch < 91) {
                letterCount[ch - 65]++;
            }else {
                letterCount[ch - 71]++;
            }
            
        }
        
        return letterCount;
    }

}

