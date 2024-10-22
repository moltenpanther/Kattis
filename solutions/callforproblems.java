import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class callforproblems {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        int count = 0;
        for(int i = 0; i < num; i++) {
            
            int difficulty = Integer.parseInt(br.readLine());
            if(difficulty % 2 == 1) {
                count++;
            }
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
