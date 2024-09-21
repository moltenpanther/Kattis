import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class midi {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            sb.append(br.readLine());
        }
        
        // Output
        System.out.println(sb.reverse());
        
        br.close();
    }

}
