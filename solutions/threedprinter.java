import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class threedprinter {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());      
        int days = (int) Math.ceil(1 + (Math.log(num)) / Math.log(2));
        
        // Output
        System.out.println(days);
        
        br.close();
    }

}
