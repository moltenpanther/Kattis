import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class textureanalysis {
    
public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringBuilder sbPat = new StringBuilder();
        
        int count = 0;
        String word = br.readLine();
        while(word.charAt(0) != 'E') {
            
            int len = word.length();
            
            // Finding the pattern
            sb.append('*');
            for(int i = 1; i < len; i++) {
                
                char ch = word.charAt(i);
                if(ch == '.') {
                    sb.append(ch);
                }else {
                    i = len;
                }
            }
            
            String pattern = sb.toString();
            sb = new StringBuilder();
            
            // Needs to be All-Stars (someBODY...)
            boolean good = true;
            if(pattern.length() == 1) {
                
                for(int i = 1; i < len; i++) {
                    if(word.charAt(i) != '*') {
                        good = false;
                        i = len;
                    }
                }
            
            // Checking the pattern across the input 
            }else {
                
                // Looping through the word
                int lenPat = pattern.length();
                for(int j = 0; j < len; j += lenPat) {
                    
                    for(int k = 0; k < lenPat && j + k < len; k++) {
                        
                        if(word.charAt(j + k) != pattern.charAt(k)) {
                            good = false;
                            j = len;
                            k = lenPat;
                        }
                    }
                }
            }
            
            // Setting up output
            sbPat.append(++count);
            if(!good) {
                sbPat.append(" NOT");
            }
            sbPat.append(" EVEN\n");
            
            word = br.readLine();
        }
        
        // Output
        System.out.print(sbPat);
        
        br.close();
    }

}
