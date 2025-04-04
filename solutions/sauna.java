import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sauna {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        int min = 0;
        int max = 0;

        String[] line = br.readLine().split(" ");
        min = Integer.parseInt(line[0]);
        max = Integer.parseInt(line[1]);

        for(int i = 1; i < num; i++) {
            line = br.readLine().split(" ");
            int lower = Integer.parseInt(line[0]);
            int upper = Integer.parseInt(line[1]);

            if(lower > min) {
                min = lower;
            }
            if(upper < max) {
                max = upper;
            }
        }

        // Output
        if(min > max) {
            System.out.println("bad news");
        } else {
            System.out.println((max - min) + 1  + " " + min);
        }

        br.close();
    }

}
