import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pobudget {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        long total = 0;
        for(int i = 0; i < num; i++) {
            br.readLine();
            long cost = Long.parseLong(br.readLine());
            total += cost;
        }

        // Output
        if(total > 0) {
            sb.append("Usch, vinst");
        }else if(total < 0) {
            sb.append("Nekad");
        }else {
            sb.append("Lagom");
        }

        System.out.println(sb);

        br.close();
    }

}
