import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class thoringtest {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashSet<String> hash = new HashSet<String>();
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
        	String word = br.readLine().toLowerCase();
        	hash.add(word);
        }
        
        String[] sentence = br.readLine().split(" ");
        
        boolean match = true;
        for(int i = 0; i < sentence.length && match; i++) {
        	
        	String word = sentence[i].toLowerCase();
        	if(!hash.contains(word)) {
        		match = false;
        	}
        }
        
        // Output
        if(match) {
        	System.out.println("Hi, how do I look today?");
        }else {
        	System.out.println("Thore has left the chat");
        }
   		
    	br.close();
    }

}
