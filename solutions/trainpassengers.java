import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trainpassengers {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        long max = Long.parseLong(line[0]);
        long stops = Long.parseLong(line[1]);
        
        long riding = 0;
        boolean possible = true;
        for(long i = 0; i < stops && possible; i++) {
            
            line = br.readLine().split(" ");
            long off = Long.parseLong(line[0]);
            long on = Long.parseLong(line[1]);
            long station = Long.parseLong(line[2]);
            
            riding -= off;
            if(riding < 0) {
                possible = false;
            }
            
            riding += on;
            if(riding > max) {
                possible = false;
            }
            
            if(station > 0 && riding != max) {
                possible = false;
            }
        }
        
        if(riding != 0) {
            possible = false;
        }
        
        // Output
        if(possible) {
            System.out.println("possible");
        }else {
            System.out.println("impossible");
        }
        
        br.close();
    }

}

