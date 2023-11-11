import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pinnifraendi {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        sb.append("0.");
        for(int i = 0; i < num - 1; i++) {
            sb.append(0);
        }
        sb.append("1");
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
