import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class rationalarithmetic {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            BigInteger x1 = new BigInteger(line[0]);
            BigInteger y1 = new BigInteger(line[1]);
            BigInteger x2 = new BigInteger(line[3]);
            BigInteger y2 = new BigInteger(line[4]);
            
            BigInteger[] frac1 = {x1, y1};
            BigInteger[] frac2 = {x2, y2};
            
            BigInteger[] ans = new BigInteger[2];
            
            char op = line[2].charAt(0);
            if(op == '+') {
                ans = add(frac1, frac2);
            }else if(op == '-') {
                ans = subtract(frac1, frac2);
            }else if(op == '*') {
                ans = multiply(frac1, frac2);
            }else if(op == '/') {
                ans = divide(frac1, frac2);
            }
            
            sb.append(ans[0] + " / " + ans[1]);
            sb.append("\n");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }
    
    // Add
    public static BigInteger[] add(BigInteger[] frac1, BigInteger[] frac2) {
        
        BigInteger nom = BigInteger.ZERO;
        BigInteger denom = BigInteger.ZERO;
        
        BigInteger ansL = frac1[0].multiply(frac2[1]);
        BigInteger ansR = frac2[0].multiply(frac1[1]);
        
        nom = ansL.add(ansR);
        denom = frac1[1].multiply(frac2[1]);
        
        BigInteger[] ans = reduceFraction(nom, denom);
        
        return ans;
    }
    
    // Subtract
    public static BigInteger[] subtract(BigInteger[] frac1, BigInteger[] frac2) {
        
        BigInteger nom = BigInteger.ZERO;
        BigInteger denom = BigInteger.ZERO;
        
        BigInteger ansL = frac1[0].multiply(frac2[1]);
        BigInteger ansR = frac2[0].multiply(frac1[1]);
        
        nom = ansL.subtract(ansR);
        denom = frac1[1].multiply(frac2[1]);
        
        BigInteger[] ans = reduceFraction(nom, denom);
        
        return ans;
    }
    
    // Multiply
    public static BigInteger[] multiply(BigInteger[] frac1, BigInteger[] frac2) {
        
        BigInteger nom = BigInteger.ZERO;
        BigInteger denom = BigInteger.ZERO;
        
        nom = frac1[0].multiply(frac2[0]);
        denom = frac1[1].multiply(frac2[1]);
        
        BigInteger[] ans = reduceFraction(nom, denom);
        
        return ans;
    }
    
    // Divide
    public static BigInteger[] divide(BigInteger[] frac1, BigInteger[] frac2) {
        
        BigInteger nom = BigInteger.ZERO;
        BigInteger denom = BigInteger.ZERO;
        
        nom = frac1[0].multiply(frac2[1]);
        denom = frac1[1].multiply(frac2[0]);
        
        BigInteger[] ans = reduceFraction(nom, denom);
        
        return ans;
    }
    
    // Fraction reducer
    public static BigInteger[] reduceFraction(BigInteger nom, BigInteger denom) { 
        
        BigInteger[] fraction = new BigInteger[2];

        BigInteger gcd = nom.gcd(denom);
        nom = nom.divide(gcd);
        denom = denom.divide(gcd);
            
        // Fixing signs
        if(denom.compareTo(BigInteger.ZERO) < 0) {
            nom = nom.negate();
            denom = denom.negate();
        }
        
        
        fraction[0] = nom;
        fraction[1] = denom;
        
        return fraction;
    }
    
}
