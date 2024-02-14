import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class jage {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // true = hunter, false = not
        Hashtable<String, Boolean> hash = new Hashtable<String, Boolean>();
        HashSet<String> cheaters = new HashSet<String>();
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[1]);
        
        line = br.readLine().split(" ");
        hash.put(line[0], true);
        for(int i = 1; i < line.length; i++) {
            hash.put(line[i], false);
        }
        
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            String tagger = line[0];
            String tagged = line[2];
            
            if(!hash.get(tagger)) {
                cheaters.add(tagger);
            }
            
            hash.replace(tagger, false);
            hash.replace(tagged, true);
        }
        
        Object[] arr = cheaters.toArray();
        Arrays.sort(arr);
        
        // Output
        StringBuilder sb = new StringBuilder();
        sb.append(arr.length + "\n");
        for(Object name : arr) {
            sb.append(name + " ");
        }
        System.out.println(sb);
        
        br.close();
    }

}
