import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class secretchamber {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        String[] line = br.readLine().split(" ");
        int translations = Integer.parseInt(line[0]);
        int toTranslate = Integer.parseInt(line[1]);
        
        boolean[][] grid = new boolean[26][26];
        
        // Setting up the Hashes
        for(int i = 0; i < 26; i++) {
            grid[i][i] = true;
        }
        
        // Adding translations
        for(int i = 0; i < translations; i++) {
            String chars = br.readLine();
            int from = chars.charAt(0) - 97;
            int to = chars.charAt(2) - 97;
            grid[from][to] = true;
        }
        
        // Adding the rest?
        boolean added = true;
        while(added) {
            
            added = false;
            // Picking a letter FROM
            for(int i = 0; i < 26; i++) {
                
                // Checking all of the letters TO
                for(int j = 0; j < 26; j++) {
                    
                    // If FROM -> TO, ADD ALL TOs to FROM
                    if(grid[i][j] && i != j) {
                        for(int k = 0; k < 26; k++) {
                            if(grid[j][k] && !grid[i][k]) {
                                grid[i][k] = true;
                                added = true;
                            }
                        }
                    }
                }
            }
        }
        
        // Translating the words
        for(int i = 0; i < toTranslate; i++) {
            
            line = br.readLine().split(" ");
            String word1 = line[0];
            String word2 = line[1];
            
            boolean match = true;
            if(word1.length() != word2.length()) {
                match = false;
            }
                
            // Checking the characters
            for(int j = 0; j < word1.length() && match; j++) {
                
                int ch1 = word1.charAt(j) - 97;
                int ch2 = word2.charAt(j) - 97;
                
                if(!grid[ch1][ch2]) {
                    match = false;
                }
            }
                
            if(match) {
                sb.append("yes");
            }else {
                sb.append("no");
            }
            sb.append("\n");
        }
        
        // Output
        System.out.println(sb);
        br.close();
    }

}
