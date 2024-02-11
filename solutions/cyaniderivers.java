import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cyaniderivers {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        
        double count = 0;
        double max = -1;
        for(int i = 0; i < line.length(); i++) {
            
            char ch = line.charAt(i);
            if(ch == '0') {
                count++;
            }else {
                if(count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        
        // Output
        int ans = (int)Math.ceil(max / 2);
        System.out.println(ans);
        
        br.close();
    }

}
