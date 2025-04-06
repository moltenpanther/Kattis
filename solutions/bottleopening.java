import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bottleopening {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int bottles = Integer.parseInt(br.readLine());
        int open = Integer.parseInt(br.readLine());

        // Loop
        if(open >= bottles) {
            sb.append("impossible");
        } else {
                        
            for(int i = 1; i < bottles && open > 0; i++) {
                sb.append("open ").append(i).append(" using ").append(bottles);
                open--;
                if(open > 0) {
                    sb.append("\n");
                }
            }
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
