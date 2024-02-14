import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reseto {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int goal = Integer.parseInt(line[1]);
        
        boolean[] sieve = new boolean[num + 1];
        int ans = 0;
        
        int count = 0;
        int hop = 2;
        while(count < goal) {
            
            // Sieve hoppin'
            for(int i = hop; i <= num; i += hop) {
                if(!sieve[i]) {
                    sieve[i] = true;
                    count++;
                    if(count == goal) {
                        ans = i;
                        i = num + 1;
                    }
                }
            }
            
            // Finding the next hop interval
            while(sieve[hop] && count != goal) {
                hop++;
            }
        }
        
        // Output
        System.out.println(ans);
        
        br.close();
    }

}
