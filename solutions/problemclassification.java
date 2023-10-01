import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;

public class problemclassification {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Hashtable<String, HashSet<String>> categories = new Hashtable<String, HashSet<String>>();       
        Hashtable<String, Integer> words = new Hashtable<String, Integer>();    
        
        // Filling the initial Hashes
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            String[] line = br.readLine().split(" ");
            
            int len = Integer.parseInt(line[1]);
            HashSet<String> catWords = new HashSet<String>();
            
            for(int j = 0; j < len; j++) {
                
                String word = line[j + 2];
                catWords.add(word);
                
                if(!words.contains(word)) {
                    words.put(word, 0);
                }
            }
            
            categories.put(line[0], catWords);
        }
        
        // Processing the text
        String inp = "";
        while((inp = br.readLine()) != null) {
            
            String[] line = inp.split(" ");
            
            for(int i = 0; i < line.length; i++) {
                String word = line[i];
                if(words.containsKey(word)) {
                    int count = words.get(word);
                    words.replace(word, ++count);
                }
            }
            
        }
        
        // Counting the occurrences
        Hashtable<String, Integer> matchCount = new Hashtable<String, Integer>();
        
        int max = -1;
        for(String word : words.keySet()) {
            for(String cat : categories.keySet()) {
                if(categories.get(cat).contains(word)) {
                    
                    int count = words.get(word);
                    if(matchCount.containsKey(cat)) {
                        int catCount = matchCount.get(cat);
                        matchCount.replace(cat, count + catCount);
                    }else {
                        matchCount.put(cat, count);
                    }
                                        
                    if(matchCount.get(cat) > max) {
                        max = matchCount.get(cat);
                    }
                }
            }
        }
        
        ArrayList<String> wordList = new ArrayList<String>();       
        for(String cat : matchCount.keySet()) {
            if(matchCount.get(cat) == max) {
                wordList.add(cat);
            }
        }
                
        Collections.sort(wordList);

        // Output
        for(String word : wordList) {
            System.out.println(word);       
        }
        
        br.close();
    }

}

