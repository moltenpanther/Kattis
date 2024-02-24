import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class shoppinglist {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int items = Integer.parseInt(line[1]);
        
        // <Item, Index>
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        
        // Fills grocery list and item count
        for(int i = 0; i < num - 1; i++) {
            
            HashSet<String> thisList = new HashSet<String>();
            
            line = br.readLine().split(" ");
            for(int j = 0; j < items; j++) {
                
                String item = line[j];
                if(!thisList.contains(item)) {
                    
                    thisList.add(item);
                    if(!hash.containsKey(item)) {
                        hash.put(item, 0);
                    }
                    
                    int val = hash.get(item);
                    hash.put(item, val + 1);
                }
            }
        }
        
        ArrayList<String> list = new ArrayList<String>();
        
        // Last line
        line = br.readLine().split(" ");
        HashSet<String> thisList = new HashSet<String>();
        for(int j = 0; j < items; j++) {
            
            String item = line[j];
            if(!thisList.contains(item)) {
                thisList.add(item);
                if(!hash.containsKey(item)) {
                    hash.put(item, 0);
                }
                
                int val = hash.get(item);
                hash.put(item, val + 1);
                
                if(val + 1 == num) {
                    list.add(item);
                }
            }
        }
        
        Collections.sort(list);
        
        sb.append(list.size() + "\n");
        for(String item : list) {
            sb.append(item + "\n");
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

}
