import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class irepeatmyself {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        for(int h = 0; h < num; h++) {
            
            String word = br.readLine();
            int len = word.length();
            
            // Incrementing lengths
            for(int i = 1; i <= len; i++) {
                
                String sub = word.substring(0, i);
                
                // Looping through the word, increasing by length
                boolean match = true;
                for(int j = 0; j < len; j += i) {
                    
                    for(int k = 0; k < i && j + k < len; k++) {
                        
                        if(word.charAt(j + k) != sub.charAt(k)) {
                            match = false;
                            j = len;
                            k = i;
                        }
                    }
                }
                
                if(match) {
                    sb.append(i);
                    sb.append("\n");
                    i = len + 1;
                }
            }
        
        }
        System.out.print(sb);
        
        br.close();
    }

}
