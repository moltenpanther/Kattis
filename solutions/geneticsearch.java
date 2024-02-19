import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class geneticsearch {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder out = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        HashSet<String> hash = new HashSet<String>();
        
        String[] letters = {"A", "C", "G", "T"};
        
        String inp = br.readLine();
        while(inp.length() > 1) {
            String[] line = inp.split(" ");
            String str = line[0];
            String full = line[1];
            
            // Type 1
            hash.add(str);
            int count = getCount(hash, full);
            hash.clear();
            out.append(count + " ");
            
            // Type 2
            for(int i = 0; i < str.length(); i++) {
                
                sb = new StringBuilder();
    
                String left = str.substring(0, i);
                String right = str.substring(i + 1);
                
                sb.append(left);
                sb.append(right);
                hash.add(sb.toString());
                
            }
            count = getCount(hash, full);
            hash.clear();
            out.append(count + " ");
            
            // Type 3
            for(int i = 0; i < str.length(); i++) {
                
                sb = new StringBuilder();
                
                String left = str.substring(0, i + 1);
                String right = str.substring(i + 1);
    
                
                for(int j = 0; j < 4; j++) {
                    
                    sb = new StringBuilder();
                    
                    sb.append(left);
                    sb.append(letters[j]);
                    sb.append(right);
    
                    hash.add(sb.toString());
                }
            }
            
            // Add start and end
            for(int j = 0; j < 4; j++) {
                
                sb = new StringBuilder();
                
                sb.append(letters[j]);
                sb.append(str);
                
                hash.add(sb.toString());
            }
            for(int j = 0; j < 4; j++) {
                
                sb = new StringBuilder();
                
                sb.append(str);
                sb.append(letters[j]);
                
                hash.add(sb.toString());
            }
            
            count = getCount(hash, full);
            hash.clear();
            out.append(count + " \n");
            
            inp = br.readLine();
            
        }
        
        // Output
        System.out.println(out);
        
        br.close();
    }

    public static int getCount(HashSet<String> hash, String full) {
        
        int count = 0;
        for(String dna : hash) {
            
            for(int i = 0; i < full.length() - dna.length() + 1; i++) {
                
                boolean match = true;
                for(int j = 0; j < dna.length(); j++) {
                    if(full.charAt(i + j) != dna.charAt(j)) {
                        match = false;
                    }
                }
                
                if(match) {
                    count++;
                }
            }
        }       
        
        return count;
    }

}
