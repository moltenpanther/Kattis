import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bitteeinbit {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        
        // Output
        System.out.println(line.charAt(0));
        
        br.close();
    }

}
