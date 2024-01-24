import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class candlebox {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int dif = Integer.parseInt(br.readLine());
        int rita = Integer.parseInt(br.readLine());
        int theo = Integer.parseInt(br.readLine());
        
        int totalBox = rita + theo;
        
        int totalRita = 0;
        int totalTheo = 0;
        for(int i = 4; i < 50; i++) {
            
            totalRita += i;
            if(i - dif >= 3) {
                totalTheo += i - dif;               
            }
            
            if(totalRita + totalTheo == totalBox) {
                
                i = 51;
                
                // Output
                int ans = rita - totalRita;
                System.out.println(ans);
            }
        }
        
        br.close();
    }

}
