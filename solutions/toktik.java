import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class toktik {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        
        int num = Integer.parseInt(br.readLine());
        
        String best = "NOBODY";
        int max = -1;
        for(int i = 0; i < num; i++) {
        	
        	String[] line = br.readLine().split(" ");
        	String name = line[0];
        	int views = Integer.parseInt(line[1]);
        	
        	if(!hash.containsKey(name)) {
        		hash.put(name, 0);
        	}
        	
        	int oldViews = hash.get(name);
        	int totalViews = oldViews + views;
        	hash.replace(name, totalViews);
            
        	if(totalViews > max) {
        		max = totalViews;
        		best = name;
        	}
        }
        
        // Output
    	System.out.println(best);
   		
    	br.close();
    }

}
