import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aldur {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < num; i++) {
            int num2 = Integer.parseInt(br.readLine());
            if(num2 < min) {
                min = num2;
            }
        }

        // Output
        System.out.println(min);

        br.close();
    }

}
