import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mylla {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        String winStr = br.readLine();
        
        // Loop
        int countA = 0;
        int countH = 0;

        int winsA = 0;
        int winsH = 0;

        for(int i = 0; i < winStr.length(); i++) {
            if(winStr.charAt(i) == 'A') {
                countA++;
            } else if(winStr.charAt(i) == 'H') {
                countH++;
            }

            if(countA == 3) {
                winsA++;
                countA = 0;
                countH = 0;
            } else if(countH == 3) {
                winsH++;
                countA = 0;
                countH = 0;
            }
        }

        // Output
        if(winsA > winsH) {
            sb.append("Hannes");
        } else if(winsH > winsA) {
            sb.append("Arnar");
        }

        System.out.println(sb);

        br.close();
    }

}
