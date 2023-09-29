import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class enlarginghashtables {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        int num = Integer.parseInt(line);
            
        while(num != 0) {
            
            String out = "";
            boolean startPrime = checkPrime(num);
            if(!startPrime) {
                out = " (" + num + " is not prime)";
            }
            
            num *= 2;
            boolean prime = false;
            while(!prime) {
                num++;
                prime = checkPrime(num);
            }
            
            // Output
            System.out.println(num + out);              

            
            line = br.readLine();
            num = Integer.parseInt(line);
            
        }
                
                
        br.close();
    }

    public static boolean checkPrime(int num) {
        
        double sqrt = Math.sqrt(num);
        for(int i = 2; i <= sqrt; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        
        return true;
    }

}

