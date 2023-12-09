import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reduplikation {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine();
        int num = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++) {
            sb.append(word);
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
