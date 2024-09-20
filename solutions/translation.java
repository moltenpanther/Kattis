import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class translation {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        br.readLine();
        String[] sentence = br.readLine().split(" ");
        
        HashMap<String, String> hash = new HashMap<String, String>();
        int num = Integer.parseInt(br.readLine());

        // Filling the dictionary
        for(int i = 0; i < num; i++) {
        	String[] translation = br.readLine().split(" ");
            hash.put(translation[0], translation[1]);
        }
        
        // Translating...
        for(int i = 0; i < sentence.length; i++) {
        	sb.append(hash.get(sentence[i]) + " ");
        }
        
        // Output
    	System.out.println(sb);
   		
    	br.close();
    }

}
