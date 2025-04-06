import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class meltingsnow {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        String[] line = br.readLine().split(" ");
        float snow = Integer.parseInt(line[0]);
        float perc = Integer.parseInt(line[1]);
        
        float max = (100 * snow) / perc;

        // Output
        System.out.println(max);

        br.close();
    }

}
