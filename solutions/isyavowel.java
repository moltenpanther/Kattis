import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isyavowel {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        
        int vowels = 0;
        int y = 0;
        
        for(int i = 0; i < line.length(); i++) {
            
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }else if(ch == 'y') {
                y++;
            }
            
        }
        
        // Output
        System.out.println(vowels + " " + (vowels + y));
        
        br.close();
    }

}
