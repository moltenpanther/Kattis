import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String mine = br.readLine();
        String friend = br.readLine();
        
        int len = mine.length();
        
        int match = 0;
        for(int i = 0; i < len; i++) {
            if(mine.charAt(i) == friend.charAt(i)) {
                match++;
            }
        }
        
        int rem = len - num;
        int notMatch = len - match;
        
        int ans = notMatch;
        if(rem < notMatch) {
            ans = rem;
        }
        
        // Output
        System.out.println((match - rem) + (2 * ans));
        
        br.close();
    }

}
