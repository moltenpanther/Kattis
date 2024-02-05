import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class simplearithmetic {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	String[] line = br.readLine().split(" ");
    	BigDecimal a = new BigDecimal(line[0]);
    	BigDecimal b = new BigDecimal(line[1]);
    	BigDecimal c = new BigDecimal(line[2]);
    	
    	int scale = 7;
    	BigDecimal ans = a.multiply(b).divide(c, scale, RoundingMode.HALF_UP);
    	
    	// Output
    	System.out.printf("%.7f", ans);
   		
    	br.close();
    }

}
