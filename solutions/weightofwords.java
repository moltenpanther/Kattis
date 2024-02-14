import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class weightofwords {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int len = Integer.parseInt(line[0]);
        int score = Integer.parseInt(line[1]);
        
        StringBuilder sb = new StringBuilder();
        
        if(len > score || score > len * 26) {
            sb.append("impossible");
        }else if(score > 26){
            
            while(score - 26 >= len) {
                score -= 26;
                sb.append((char) (26 + 96));
                len--;
            }
            
            int first = score - (len - 1);
            sb.append((char) (first + 96));
            
            for(int i = 0; i < len - 1; i++) {
                sb.append((char) 97);
            }
            
        }else {
            
            int first = score - (len - 1);
            sb.append((char) (first + 96));
            
            for(int i = 0; i < len - 1; i++) {
                sb.append((char) 97);
            }
            
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
