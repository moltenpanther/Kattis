import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class touchscreenkeyboard {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<Character, Integer[]> hash = new Hashtable<Character, Integer[]>();
        
        char[][] keyboard = {{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
                             {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ' '},
                             {'z', 'x', 'c', 'v', 'b', 'n', 'm', ' ', ' ', ' '}};
        
        // Setting up the distances
        for(int i = 0; i < keyboard.length; i++) {
            for(int j = 0; j < keyboard[0].length; j++) {
                
                Character letter = keyboard[i][j];
                if(letter != ' ') {
                    Integer[] coord = {i, j};
                    hash.put(letter, coord);
                }       
            }
        }
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            
            String word = line[0];
            Hashtable<String, Integer> distances = new Hashtable<String, Integer>();            
            
            int num2 = Integer.parseInt(line[1]);           
            for(int j = 0; j < num2; j++) {
                
                String check = br.readLine();
                int sum = 0;
                for(int k = 0; k < check.length(); k++) {
                    
                    Character wordLetter = word.charAt(k);
                    Character checkLetter = check.charAt(k);
                    
                    Integer[] wordCoord = hash.get(wordLetter);
                    Integer[] checkCoord = hash.get(checkLetter);

                    int dis = Math.abs(wordCoord[0] - checkCoord[0]) + Math.abs(wordCoord[1] - checkCoord[1]);
                    sum += dis;
                    
                }
                
                distances.put(check, sum);
            }

            // Sorts the entries in the hash as a list
            List<Map.Entry<String, Integer>> list = new ArrayList<>(distances.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    int compare = o1.getValue().compareTo(o2.getValue());
                    if (compare != 0) {
                        return compare; // Sort by value
                    } else {
                        return o1.getKey().compareTo(o2.getKey()); // Sort alphabetically by key
                    }
                }
            });
            
            for(Map.Entry<String, Integer> entry : list) {
    
                String out = entry.getKey();
                int dis = entry.getValue();
                System.out.println(out + " " + dis);
            }

        }

        // Output
        System.out.println("");
        
        br.close();
    }

}

