import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flyingsafely {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            int cities = Integer.parseInt(line[0]);
            int pilots = Integer.parseInt(line[1]);
            
            for(int j = 0; j < pilots; j++) {
                br.readLine();
            }
                
            // Output
            System.out.println(cities - 1);
                        
        }
        
        br.close();
    }

}

