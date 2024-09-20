import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class fyrirtaekjanafn {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('Y');
        
        String company = br.readLine();
        for(int i = 0; i < company.length(); i++) {
        	
        	char ch = company.charAt(i);
        	if(vowels.contains(ch)) {
        		sb.append(ch);
        	}
        }
        
        // Output
    	System.out.println(sb);
   		
    	br.close();
    }

}
