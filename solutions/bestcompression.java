import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bestcompression {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        long num = Long.parseLong(line[0]);
        long bits = Long.parseLong(line[1]) + 1;
        
        long max = (long) Math.pow(2, bits);

        if(num < max) {
            System.out.println("yes");              
        }else {
            System.out.println("no");
        }
        
        br.close();
    }

}
