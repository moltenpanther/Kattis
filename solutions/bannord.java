import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bannord {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	HashSet<Character> hash = new HashSet<Character>();
    	
    	String letters = br.readLine();
    	
    	for(int i = 0; i < letters.length(); i++) {
    		hash.add(letters.charAt(i));
    	}
    	
    	String[] memo = br.readLine().split(" ");
    	for(int i = 0; i < memo.length; i++) {
    		
    		String word = memo[i];
    		for(int j = 0; j < word.length(); j++) {
    			
    			if(hash.contains(word.charAt(j))) {
    				String bleep = bleepWord(word.length());
    				memo[i] = bleep;
    				j = word.length();
    			}
    			
    		}
    	}
    	
    	for(int i = 0; i < memo.length; i++) {
    		System.out.print(memo[i] + " ");
    	}
    	
    	br.close();
    }

	private static String bleepWord(int length) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < length; i++) {
			sb.append('*');
		}
		
		return sb.toString();
		
	}
    
    
    
}
