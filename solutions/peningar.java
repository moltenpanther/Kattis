import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class peningar {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        long num = Long.parseLong(line[0]);
        long steps = Long.parseLong(line[1]);
        
        String[] path = br.readLine().split(" ");
        
        long index = 0;
        long total = 0;
        
        boolean empty = false;
        while(!empty) {
            
            long step = Long.parseLong(path[(int) index]);
            if(step == 0) {
                empty = true;
            }else {
                path[(int) index] = "0";
                total += step;
                index += steps;
                
                if(index >= num) {
                    index %= num;
                }
            }
        }
        
        // Output
        System.out.println(total);
        
        br.close();
    }

}
