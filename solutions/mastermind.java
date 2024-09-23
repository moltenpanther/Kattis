import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class mastermind {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        char[] code = line[1].toCharArray();
        char[] guess = line[2].toCharArray();
        
        
     // Adding the letters to a hash
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        for(int i = 0; i < num; i++) {
            
            char ch = code[i];
            if(!hash.containsKey(ch)) {
                hash.put(ch, 0);
            }
            
            int chCount = hash.get(ch);
            hash.replace(ch, chCount, chCount + 1);
        }
        
        // Finding the number correct
        int right = 0;
        for(int i = 0; i < num; i++) {
            
            char ch = code[i];
            if(ch == guess[i]) {
                
                int chCount = hash.get(ch);
                if(chCount > 1) {
                    hash.replace(ch, chCount, chCount - 1);
                }else {
                    hash.remove(ch);
                }
                
                guess[i] = '-';
                right++;
            }
        }
        
     // Finding the number in the wrong spot
        int close = 0;
        for(int i = 0; i < num; i++) {
            
            char ch = guess[i];
            if(hash.containsKey(ch)) {
                
                int chCount = hash.get(ch);
                if(chCount > 1) {
                    hash.replace(ch, chCount, chCount - 1);
                }else {
                    hash.remove(ch);
                }
                
                close++;
            }
            
        }
        
        // Output
        System.out.println(right + " " + close);
        
        br.close();
    }

}
