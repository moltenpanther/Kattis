import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class minimumscalar {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            int len = Integer.parseInt(br.readLine());
            
            String[] line = br.readLine().split(" ");
            long[] row1 = new long[len];
            for(int j = 0; j < len; j++) {
                row1[j] = Long.parseLong(line[j]);
            }
            
            line = br.readLine().split(" ");
            long[] row2 = new long[len];
            for(int j = 0; j < len; j++) {
                row2[j] = Long.parseLong(line[j]);
            }
            
            Arrays.sort(row1);
            Arrays.sort(row2);
            
            long total = 0;
            for(int j = 0; j < len; j++) {
                long mult = row1[j] * row2[(len - 1) - j];              
                total += mult;
            }
            
            // Output
            System.out.println("Case #" + (i + 1) + ": " + total);
            
        }
        
        br.close();
    }

}
