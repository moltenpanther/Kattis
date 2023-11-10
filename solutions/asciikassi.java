import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class asciikassi {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        // Top
        sb.append("+");
        for(int i = 0; i < num; i++) {
            sb.append("-");
        }
        sb.append("+\n");

        // Middle
        for(int i = 0; i < num; i++) {
            sb.append("|");
            for(int j = 0; j < num; j++) {
                sb.append(" ");
            }
            sb.append("|\n");
        }
        
        // Bottom
        sb.append("+");
        for(int i = 0; i < num; i++) {
            sb.append("-");
        }
        sb.append("+");
                
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
