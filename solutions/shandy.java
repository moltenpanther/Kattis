import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class shandy {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int beer = Integer.parseInt(br.readLine());
        int lemonade = Integer.parseInt(br.readLine());
        
        int shandies = Math.min(beer, lemonade) * 2;
        
        // Output
        System.out.println(shandies);
        
        br.close();
    }

}
