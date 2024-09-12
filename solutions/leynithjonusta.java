import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leynithjonusta {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String email = br.readLine();
        email = email.replaceAll(" ", "");
        
        // Output
        System.out.println(email);
        
        br.close();
    }

}
