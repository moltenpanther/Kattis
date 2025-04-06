import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class snowfall {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        int snow = 0;
        for(int i = 0; i < num; i++) {

            String[] line = br.readLine().split(" ");
            int fall = Integer.parseInt(line[0]);
            int amt = Integer.parseInt(line[1]);

            if(fall == 0) {
                snow += amt;
            } else {
                snow -= amt;
                if(snow < 0) {
                    snow = 0;
                }
            }
        }

        // Output
        System.out.println(snow);

        br.close();
    }

}
