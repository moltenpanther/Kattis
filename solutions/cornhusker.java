import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cornhusker {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        
        int avg = 0;
        for(int i = 0; i < line.length; i += 2) {
            
            int around = Integer.parseInt(line[i]);
            int length = Integer.parseInt(line[i + 1]);
            
            avg += around * length;
        }
        
        avg /= 5;
        
        line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int kwf = Integer.parseInt(line[1]);
        
        avg *= num;
        avg /= kwf;
        
        // Output
        System.out.println(avg);
        
        br.close();
    }

}
