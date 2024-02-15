import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class artichoke {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Getting input
        String[] line = br.readLine().split(" ");
        double p = Double.parseDouble(line[0]);
        double a = Double.parseDouble(line[1]);
        double b = Double.parseDouble(line[2]);
        double c = Double.parseDouble(line[3]);
        double d = Double.parseDouble(line[4]);
        double num = Double.parseDouble(line[5]);
        
        // Calculating prices *and* finding max decrease in same loop
        double max = Integer.MIN_VALUE;
        double maxDecr = 0;
        for(double k = 1; k <= num; k++) {
            double price = p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
            
            double decr = max - price;
            if(decr > maxDecr) {
                maxDecr = decr;
            }
            
            if(price > max) {
                max = price;
            }
        }
        
        // Output
        System.out.println(maxDecr);
        
        br.close();
    }

}
