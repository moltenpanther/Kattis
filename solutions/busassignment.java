import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class busassignment {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        int total = 0;
        int max = 0;
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            int off = Integer.parseInt(line[0]);
            int on = Integer.parseInt(line[1]);

            total -= off;
            total += on;

            if(total > max) {
                max = total;
            }
        }

        // Output
        System.out.println(max);

        br.close();
    }

}
