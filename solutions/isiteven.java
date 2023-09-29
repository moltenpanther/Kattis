import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class isiteven {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        
        long mult = 1;
        for(int i = 0; i < num && k > 0; i++) {
            int x = Integer.parseInt(br.readLine());
            mult *= x;
            
            while(mult % 2 == 0 && k > 0) {
                mult /= 2;
                k--;
            }
        }
                
        // Output
        if(k == 0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
                
        br.close();
    }

}

