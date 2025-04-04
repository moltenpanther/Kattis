import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class airfaregrants {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num; i++) {
            
            int flight = Integer.parseInt(br.readLine());
            if(flight < min) {
                min = flight;
            }
            if(flight > max) {
                max = flight;
            }
            
        }

        int cost = min - (max / 2);
        if(cost < 0) {
            cost = 0;
        }

        // Output
        System.out.println(cost);

        br.close();
    }

}
