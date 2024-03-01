import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class longestprimesum {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long num = Long.parseLong(br.readLine());
        long ans = Math.floorDiv(num, 2);
        
        // Output
        System.out.println(ans);
        
        br.close();
    }

}
