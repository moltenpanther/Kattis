import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class anti11 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cases = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < cases; i++) {
                    
            int num = Integer.parseInt(br.readLine());
            
            int first = 0;
            int second = 1;
            int ans = 0;
            
            for(int j = 0; j < num + 1; j++) {      
                ans = (first + second) % 1000000007;
                first = second;
                second = ans;
            }
            
            // Output
            System.out.println(ans);
            
        }
        
        br.close();
    }

}
