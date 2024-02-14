import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dst {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            char command = line[0].charAt(0);
            int change = Integer.parseInt(line[1]);
            int hour = Integer.parseInt(line[2]);
            int min = Integer.parseInt(line[3]);
            
            int hourCh = change / 60;
            int minCh = change % 60;
            
            // Roll forward
            if(command == 'F') {
                hour += hourCh;
                min += minCh;
                
                if(min >= 60) {
                    hour++;
                    min -= 60;
                }
                
                if(hour > 23) {
                    hour -= 24;
                }
                
            // Roll back
            }else {
                
                hour -= hourCh;
                min -= minCh;
                
                if(min < 0) {
                    hour--;
                    min += 60;
                }
                
                if(hour < 0) {
                    hour += 24;
                }
                
            }
            
            sb.append(hour + " " + min + "\n");
            
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
