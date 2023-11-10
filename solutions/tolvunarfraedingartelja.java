import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tolvunarfraedingartelja {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        
        // Output
        System.out.println(num - 1);
        
        br.close();
    }

}
