import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lastminute {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        long Au = Long.parseLong(line[0]);
        long Bu = Long.parseLong(line[1]);
        long Ar = Long.parseLong(line[2]);
        long Br = Long.parseLong(line[3]);
        
        long sum = 0;
        
        if(Br > 0) {
            sum += Au;   
            Au = 0;
        }   
        if(Ar > 0) {
            sum += Bu;
            Bu = 0;
        }
        
        sum += Math.min(Au, Bu);
        sum += Ar * Br;
        
        // Output
        System.out.println(sum);
        
        br.close();
    }

}
