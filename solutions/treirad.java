import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class treirad {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        
        int trip = 0;
        int count = 0;
        while(trip < num) {
            trip = (count + 1) * (count + 2) * (count + 3);
            count++;
        }
        
        // Output
        System.out.println(count - 1);
        
        br.close();
    }

}
