import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class training {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int skill = Integer.parseInt(line[1]);
        
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            int lower = Integer.parseInt(line[0]);
            int upper = Integer.parseInt(line[1]);
            
            if(lower <= skill && skill <= upper) {
                skill++;
            }
        }
        
        // Output
        System.out.println(skill);
        
        br.close();
    }
    
}
