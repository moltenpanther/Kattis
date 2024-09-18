import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decimaldeletion {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        float num = Float.parseFloat(br.readLine());
        
        num = Math.round(num);
        
        // Output
        System.out.println((int)num);
        
        br.close();
    }

}
