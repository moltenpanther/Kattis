import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cypherdecypher {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    	
    	String multiplier = br.readLine();
    	int num = Integer.parseInt(br.readLine());
    	for(int i = 0; i < num; i++) {
	    	
    		String word = br.readLine();
    		String ans = "";
    		
    		for(int j = 0; j < word.length(); j++) {
    			int ascii = word.charAt(j) - 65;
    			ascii *= Integer.parseInt(multiplier.substring(j, j + 1));
    			ascii %= 26;
    			ans += (char)(ascii + 65);
    		}
    		System.out.println(ans);
    	}
   		
    	br.close();
    }

}
