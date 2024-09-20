import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fargrobot {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        String line = br.readLine();
        
        for(int i = 0; i < num; i++) {
            
            int red = line.indexOf('R');
            int green = line.indexOf('G');
            int blue = line.indexOf('B');
            
            int max = Math.max(Math.max(red, green), blue);
            
            char ch = line.charAt(max);
            sb.append(ch);
            
            line = line.substring(max + 1);
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
