import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class guessinggame {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int min = 0;
        int max = 11;
        
        boolean lie = false;
        while(num != 0) {
            
            String line = br.readLine();
            char ch = line.charAt(4);
            
            // Too high
            if(ch == 'h') {
                if(num <= max) {
                    max = num;
                }
                
            // Too low
            }else if(ch == 'l') {
                if(num >= min) {
                    min = num;
                }
                
            // Right on!
            }else if(ch == 't') {
                
                if(num <= min || num >= max) {
                    lie = true;
                }
                
                if(lie) {
                    sb.append("Stan is dishonest\n");
                }else {
                    sb.append("Stan may be honest\n");
                }
                
                min = 0;
                max = 11;
                lie = false;
            }
            
            num = Integer.parseInt(br.readLine());
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

}
