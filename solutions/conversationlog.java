import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class conversationlog {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	
    	Hashtable<String, HashSet<String>> names = new Hashtable<String, HashSet<String>>();
    	Hashtable<String, Integer> wordCount = new Hashtable<String, Integer>();
    	
    	for(int i = 0; i < num; i++) {
    		
    		String[] text = br.readLine().split(" ");
    		String name = text[0];
    		
    		if(!names.containsKey(name)) {
    			HashSet<String> words = new HashSet<String>();
    			names.put(name, words);
    		}
    		
    		HashSet<String> words = names.get(name);
    		
    		// Counting occurrences of each word
    		for(int j = 1; j < text.length; j++) {
    			
    			String word = text[j];
    			if(!words.contains(word)) {
    				words.add(word);
    			}
    			
    			if(!wordCount.containsKey(word)) {
    				wordCount.put(word, 0);
    			}
    			
    			int count = wordCount.get(word);
    			wordCount.replace(word, ++count);
    		}
    		
    	}
    	
        // Sorts the entries in the hash as a list
    	List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int compare = o2.getValue().compareTo(o1.getValue());
                if (compare != 0) {
                    return compare; // Sort by value
                } else {
                    return o1.getKey().compareTo(o2.getKey()); // Sort alphabetically by key
                }
            }
        });
    	
        boolean mostUsed = false;
        Set<String> users = names.keySet();
        for (Map.Entry<String, Integer> entry : list) {
        	
        	String word = entry.getKey();
        	
        	boolean all = true;
        	for(String user : users) {
        		HashSet<String> words = names.get(user);
        		if(!words.contains(word)) {
        			all = false;
        			break;
        		}
        	}
        	
        	if(all) {
        		System.out.println(word);
        		mostUsed = true;
        	}
        	
        }
    	
        // Output
        if(!mostUsed) {
        	System.out.println("ALL CLEAR");        	
        }
   		
    	br.close();
    }

}
