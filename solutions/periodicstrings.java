import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class periodicstrings {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine();
        int len = word.length();
        
        // Incrementing lengths
        for(int i = 1; i <= len; i++) {
            
            if(len % i == 0) {
                String sub = word.substring(0, i);

                // Looping through the word, increasing by length
                boolean match = true;
                for(int j = 0; j < len; j += i) {
                    
                    for(int k = 0; k < i; k++) {
                        
                        if(word.charAt(j + k) != sub.charAt(k)) {
                            match = false;
                            j = len;
                            k = i;
                        }
                    }
                    
                    sub = sub.substring(sub.length() - 1) + sub.substring(0, sub.length() - 1);
                }
                
                if(match) {
                    System.out.println(i);
                    System.exit(0);
                }
                
            }
        }
        
        br.close();
    }

}
