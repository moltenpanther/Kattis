import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fjoldibokstafa {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        
        int count = 0;
        for(int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                count++;
            }
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
