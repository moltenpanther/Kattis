import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ethanol {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        sb.append(" ");
        for(int i = 0; i < num; i++) {
            sb.append(" H");
        }
        
        sb.append("\n ");
        for(int i = 0; i < num; i++) {
            sb.append(" |");
        }

        sb.append("\nH");
        for(int i = 0; i < num; i++) {
            sb.append("-C");
        }

        sb.append("-OH\n ");
        for(int i = 0; i < num; i++) {
            sb.append(" |");
        }      

        sb.append("\n ");
        for(int i = 0; i < num; i++) {
            sb.append(" H");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
