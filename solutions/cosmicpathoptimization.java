import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cosmicpathoptimization {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String[] temps = br.readLine().split(" ");
        
        int sum = 0;
        for(int i = 0; i < num; i++) {
            int temp = Integer.parseInt(temps[i]);
            sum += temp;
        }
        
        int mean = sum / num;
        
        // Output
        System.out.println(mean);
        
        br.close();
    }

}

