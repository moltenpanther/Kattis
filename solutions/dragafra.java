import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dragafra {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = Integer.parseInt(br.readLine());
        int open = Integer.parseInt(br.readLine());
        int closed = total - open;
        
        // Output
        System.out.println(closed);
        
        br.close();
    }

}
