import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class batteries {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        while(num != 0) {
            
            int ans = getQuad(num - 1);
            sb.append(ans + "\n");
            
            num = Integer.parseInt(br.readLine());
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }
    
    public static int getQuad(int c) {
        
        double frac = (-1 + Math.sqrt(1 + (8 * c))) / 2;
        double ceil = Math.ceil(frac);
        
        return (int) ceil;
    }
    
}
