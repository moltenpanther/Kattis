import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class skotleikur {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int points = Integer.parseInt(br.readLine());
        int kills  = Integer.parseInt(br.readLine());
        int assists = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        int total = 0;
        
        int count = 0;
        for(int i = points; i >= 0; i -= kills) {
            if(i % assists == 0) {
                sb.append(count + " " + (i / assists) + "\n");
                total++;
            }
            
            count++;
        }
        
        // Output
        System.out.print(total + "\n" + sb);
        
        br.close();
    }

}
