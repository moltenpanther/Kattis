import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lubbilaerir {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine();
        
        // Output
        System.out.println(word.charAt(0));
        
        br.close();
    }

}
