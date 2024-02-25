import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class triplesevens {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        
        int count = 0;
        for(int i = 0; i < 3; i++) {
            
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < line.length; j++) {
                
                int num = Integer.parseInt(line[j]);
                if(num == 7) {
                    count++;
                    j = line.length;
                }
            }
        }

        // Output
        if(count == 3) {
            System.out.println(777);
        }else {
            System.out.println(0);
        }
        
        br.close();
    }
    
}
