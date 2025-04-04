import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ginfizz {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());

        // Output
        sb.append((num * 45) + " ml gin\n");
        sb.append((num * 30) + " ml fresh lemon juice\n");
        sb.append((num * 10) + " ml simple syrup\n");
        
        sb.append(num + " slice");
        if(num > 1) {
            sb.append("s");
        }
        sb.append(" of lemon");
        
        System.out.println(sb);

        br.close();
    }

}
