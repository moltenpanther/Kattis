import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class siffrid {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Input
        String num = br.readLine();
        int len = num.length();
        
        // Loop
        int total = 0;
        for (int i = 0; i < len; i++) {
            total += num.charAt(i) - '0';
        }
        
        StringBuilder sb = new StringBuilder();

        int remaining = total;
        for (int i = 0; i < len; i++) {

            int start = 0;
            if(i == 0) {
                start = 1;
            }

            for (int candidate = start; candidate <= 9; candidate++) {

                int maxPossible = 9 * (len - i - 1);
                if (remaining - candidate <= maxPossible && remaining - candidate >= 0) {
                    sb.append(candidate);
                    remaining -= candidate;
                    break;
                }
            }
        }
        sb.append(" ");

        remaining = total;
        for (int i = 0; i < len; i++) {
            int digit = Math.min(9, remaining);
            sb.append(digit);
            remaining -= digit;
        }
        
        // Output
        System.out.println(sb);

        br.close();
    }
}
