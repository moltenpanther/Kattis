import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringPrefixes {
    
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        
        String inp = "";
        while((inp = br.readLine()) != null) {
            
            char[] pattern = inp.toCharArray();
            char[] text = br.readLine().toCharArray();
            
            int lenT = text.length;
            int lenP = pattern.length;
            int[] prefix = getPrefix(pattern);
            
            int matched = 0;
            for(int i = 0; i < lenT; i++) {
            	while(matched > 0 && pattern[matched] != text[i]) {
            		matched = prefix[matched - 1];
            	}
            	if(pattern[matched] == text[i]) {
            		matched++;
            	}
            	if(matched == lenP) {
            		matched = prefix[matched - 1];
            		sb.append((i - lenP + 1) + " ");
            	}
            	
            }
            
            sb.append("\n");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }
    
    static int[] getPrefix(char[] pattern){
    	
    	int len = pattern.length;
    	int[] prev = new int[len];
    	
    	int j = 0;
    	for(int i = 1; i < len; i++) {
    		while(j > 0 && pattern[j] != pattern[i]) {
    			j = prev[j - 1];
    		}
    		if(pattern[j] == pattern[i]) {
    			j++;
    		}
    		prev[i] = j;
    	}

    	return prev;
    }
    
}
