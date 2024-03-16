import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class biladlyklabord {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String line = br.readLine();
        
        char prev = line.charAt(0);
        sb.append(prev);
        
        for(int i = 1; i < line.length(); i++) {
            
            char ch = line.charAt(i);
            if(prev != ch) {
                sb.append(ch);
            }
            prev = ch;
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
