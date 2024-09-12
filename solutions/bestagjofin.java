import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bestagjofin {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        String winner = "";
        int max = -1;
        for(int i = 0; i < num; i++) {

            String[] line = br.readLine().split(" ");
            int fun = Integer.parseInt(line[1]);
            
            if(fun > max) {
                max = fun;
                winner = line[0];
            }
            
        }
        
        // Output
        System.out.println(winner);
        
        br.close();
    }

}
