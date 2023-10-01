import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class secretsanta {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long num = Long.parseLong(br.readLine());
        
        double fact = 1;
        double sum = 0;
        
        double ans = .63212056;
        if(num < 11) {
            
            for(int i = 0; i < num; i++) {
                
                int top = -1;
                if(i % 2 == 0) {
                    top = 1;
                }
                
                fact *= (i + 1);                
                sum += (top / fact);
            }
            
            ans = fact * sum;
        
        }
        // Output
        System.out.println(ans / fact);
        
        br.close();
    }
    
}
