import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class liquidassets {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int num = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
                
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < num; i++) {
            
            String word = line[i];
            StringBuilder sb = new StringBuilder();
            
            // Remove doubles
            char prev = ' ';
            for(int j = 0; j < word.length(); j++) {
                
                char ch = word.charAt(j);
                if(ch != prev) {
                        sb.append(ch);      
                }
                
                prev = ch;
                
            }
            
            String pass1 = sb.toString();
            
            for(int j = 0; j < pass1.length(); j++) {
                
                char ch = pass1.charAt(j);
                if(vowels.contains(ch)) {
                    if(j == 0 || j == pass1.length() - 1) {
                        ans.append(ch);
                    }
                }else {
                    ans.append(ch);
                }
            }
            
            ans.append(" ");
        }
        
        // Output
        System.out.print(ans);
        
        br.close();
    }

}
