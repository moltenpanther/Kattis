import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class communication {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        // Calculating in advance
        int[] bins = new int[256];
        for(int i = 0; i < 256; i++) {
            int bin = i;
            int out = bin ^ (bin << 1);
            bins[out % 256] = i;
        }
        
        // Reading in
        String[] line = br.readLine().split(" ");
        for(int i = 0; i < num; i++) {
            int code = Integer.parseInt(line[i]);
            int ans = bins[code];
            
            // Output
            System.out.print(ans + " ");
        }
        
        br.close();
    }

}
