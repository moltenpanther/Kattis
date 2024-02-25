import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rampantgrowth {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        long rows = Long.parseLong(line[0]);
        long cols = Long.parseLong(line[1]);
                
        long mod = 998244353;
        long mult = rows - 1;
        long ans = rows;
        for(int i = 0; i < cols - 1; i++) {
            ans *= mult;
            ans %= mod;
        }
        
        // Output
        System.out.println(ans);
        
        br.close();
    }
    
}
