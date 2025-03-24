import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class telja {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        for(int i = 1; i <= num; i++) {
            sb.append(i + "\n");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
