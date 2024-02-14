import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class champernownecount {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int div = Integer.parseInt(line[1]);

        String str = "";
        long champ = 0;
        
        int count = 0;
        for(int i = 1; i <= num; i++) {
            
            str += i;
            champ = Long.parseLong(str);
            long rem = champ % div;
            if(rem == 0) {
                count++;
                str = "";
            }else {
                str = rem + "";
            }
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
