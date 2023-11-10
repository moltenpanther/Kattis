import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flatbokuveisla {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        // Output
        System.out.println(a % b);
        
        br.close();
    }

}
