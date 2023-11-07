import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class antipalindrome {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine().toLowerCase().replaceAll(" ", "");
        
        char prev = '0';
        char next = '9';
        
        boolean good = false;
        for(int i = 0; i < line.length() - 1 && !good; i++) {
            
            char ch = line.charAt(i);
            next = line.charAt(i + 1);
            
            if(ch >= 'a' && ch <= 'z') {
                
                if(ch == prev) {
                    good = true;
                }
                
                if(prev == next) {
                    good = true;
                }
                
                prev = ch;
            }           
            
        }
        
        // Output
        if(!good) {
            System.out.println("Anti-palindrome");
        }else {
            System.out.println("Palindrome");
        }
        
        br.close();
    }

}
