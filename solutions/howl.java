import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class howl {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String howl = br.readLine();
        sb.append("AAH");
        
        for(int i = 0; i < howl.length(); i++) {
            sb.append("O");
        }
        sb.append("W");
        
        System.out.println(sb);
        
        br.close();
    }
    
}
