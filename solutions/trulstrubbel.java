import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trulstrubbel {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        String line = br.readLine();
        
        // Loop
        int scoreT = 0;
        int scoreH = 0;
        for(int i = 0; i < line.length(); i++) {
            
            char c = line.charAt(i);
            if (c == 'T') {
                scoreT++;
            } else if (c == 'H') {
                scoreH++;
            }  
            
            if((scoreT >= 11 || scoreH >= 11) && Math.abs(scoreT - scoreH) >= 2) {
                scoreT = 0;
                scoreH = 0;
            }

        }

        // Output
        System.out.println(scoreT + "-" + scoreH);

        br.close();
    }

}
