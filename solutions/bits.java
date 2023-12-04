import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bits {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {

            String inp = br.readLine();
            int max = -1;
            
            for(int j = 0; j < inp.length(); j++) {
                
                int digit = Integer.parseInt(inp.substring(0, j + 1));
                String bin = Integer.toBinaryString(digit);

                int count = 0;
                for(int k = 0; k < bin.length(); k++) {
                    
                    int bit = Integer.parseInt(bin.substring(k, k + 1));
                    if(bit == 1) {
                        count++;
                    }
                    
                }
                
                if(count > max) {
                    max = count;
                }
            }
            
            sb.append(max + "\n");
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

}
