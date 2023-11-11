import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class skammstofun {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        br.readLine();
        
        String[] line = br.readLine().split(" ");
        for(int i = 0; i < line.length; i++) {
            
            char ch = line[i].charAt(0);
            if(ch >= 'A' && ch <= 'Z') {
                sb.append(ch);
            }
            
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
