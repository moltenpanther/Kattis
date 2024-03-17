import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class hnappasetningaskipti {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Set up
        // 0 = qwerty, 1 = dvorak, 2 = bjarki
        char[][] keyboards = {{'~', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', '[', ']', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';', '\'', 'z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/', ' '},
                              {'~', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '[', ']', '\'', ',', '.', 'p', 'y', 'f', 'g', 'c', 'r', 'l', '/', '=', 'a', 'o', 'e', 'u', 'i', 'd', 'h', 't', 'n', 's', '-', ';', 'q', 'j', 'k', 'x', 'b', 'm', 'w', 'v', 'z', ' '},
                              {'0', '2', '4', '8', '6', '1', '3', '5', '7', '9', '=', '-', '/', 'b', 'j', 'a', 'r', 'k', 'i', 'g', 'u', 's', 't', '.', ',', 'l', 'o', 'e', 'm', 'p', 'd', 'c', 'n', 'v', 'q', ';', '[', ']', 'y', 'z', 'h', 'w', 'f', 'x', '\'', '~', ' '}};
        
        // <Character, Index of char in keyboards>
        HashMap<Character, Integer> qwerty = new HashMap<Character, Integer>();
        HashMap<Character, Integer> dvorak = new HashMap<Character, Integer>();
        HashMap<Character, Integer> bjarki = new HashMap<Character, Integer>();
        
        // Filling hashes
        for(int i = 0; i < keyboards[0].length; i++) {
            qwerty.put(keyboards[0][i], i);
            dvorak.put(keyboards[1][i], i);
            bjarki.put(keyboards[2][i], i);
        }
        
        // Types
        String[] line = br.readLine().split(" ");
        char keyFrom = line[0].charAt(0);
        char keyTo = line[2].charAt(0);
        
        String typed = br.readLine();
        
        // Get hash
        HashMap<Character, Integer> hash = qwerty;
        if(keyFrom == 'd') {
            hash = dvorak;
        }else if(keyFrom == 'b') {
            hash = bjarki;
        }
        
        // Get array index
        int to = 0;
        if(keyTo == 'd') {
            to = 1;
        }else if(keyTo == 'b') {
            to = 2;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < typed.length(); i++) {
            
            char ch = typed.charAt(i);
            int index = hash.get(ch);
            
            char out = keyboards[to][index];
            sb.append(out);
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

    private static HashMap<Character, Integer> getQwerty(char[][] keyboards) {
        // TODO Auto-generated method stub
        return null;
    }

    private static HashMap<Character, Integer> getBjarki() {
        
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        
        
        return null;
    }
    
    private static HashMap<Character, Integer> getDvorak() {
        
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        
        
        return null;
    }
    
    private static HashMap<Character, Integer> getQwerty() {
        
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        
        
        return null;
    }
    
}
