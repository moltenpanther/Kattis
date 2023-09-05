import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class hardwoodspecies {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	HashMap<String, Integer> hash = new HashMap<String, Integer>();
    	LinkedList<String> list = new LinkedList<String>();
    	
    	String line = "";
    	double count = 0;
    	while((line = br.readLine()) != null) {
    		
    		if(!hash.containsKey(line)) {
    			hash.put(line, 1);
    			list.add(line);
    		}else {
    			int num = hash.get(line) + 1;
    			hash.replace(line, num);
    		}
    		count++;
    	}
    	
    	Collections.sort(list);
    	
    	for(String tree : list) {
    		double prob = 100 * (hash.get(tree) / count);
    		System.out.println(tree + " " + prob);
    	}
    	
    	br.close();
    }

}
