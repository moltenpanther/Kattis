import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class toilet {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        
        int up = 0;
        int down = 0;
        int keep = 0;
        
        char prev = line.charAt(0);
        char next = line.charAt(1);

        if(prev == 'U') {
            down--;
            if(next == 'U') {
                down -= 2;
            }
        }else {
            up--;
            if(next == 'D') {
                up -= 2;
            }
        }
        
        for(int i = 0; i < line.length(); i++) {
            
            char ch = line.charAt(i);
            if(prev != ch) {
                keep++;
            }
            
            if(ch == 'D') {
                up += 2;
            }else {
                down += 2;
            }
                        
            prev = ch;
        }
        
        // Output
        System.out.println(up);
        System.out.println(down);           
        System.out.println(keep);
        
        br.close();
    }

}
