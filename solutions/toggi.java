import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class toggi {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        long num = Long.parseLong(br.readLine());
        
        double time = num * 1000000;
        
        long low = 1;
        long high = (long)1e15;
        long ans = 0;

        // Loop
        while (low <= high) {
            
            long mid = low + (high - low) / 2;
            double timeNeeded = mid * Math.log10(mid); 
            
            if (timeNeeded <= time) {
                ans = mid; 
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Outputs.
        System.out.println(ans);

        br.close();
    }
}
