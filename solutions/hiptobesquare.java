import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class hiptobesquare {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        for(int i = 0; i < num; i++) {

            int test = Integer.parseInt(br.readLine()) + 1;
            int sqrt = (int) Math.floor(Math.sqrt(test));
            int odds = (sqrt - 1) / 2;

            sb.append(odds).append("\n");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
