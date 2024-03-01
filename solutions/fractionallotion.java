import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fractionallotion {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String inp = "";
        while((inp = br.readLine()) != null) {
            
            String numStr = inp.substring(2);
            int num = Integer.parseInt(numStr);
            
            int count = 1;
            for(int i = num; i < 2 * num; i++) {
                int nom = i * num;
                int denom = i - num;
                
                if(denom > 0) {
                    int mod = nom % denom;
                    if(mod == 0) {
                        count++;
                    }
                }
            }
            
            sb.append(count + "\n");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
