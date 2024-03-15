import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kvedja {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String name = br.readLine();
        
        // Output
        System.out.println("Kvedja,\n" + name);
        
        br.close();
    }

}
