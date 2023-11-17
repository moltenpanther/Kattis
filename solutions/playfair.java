import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class playfair {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashSet<Character> alphabet = fillHash();
        LinkedList<Character> list = new LinkedList<Character>();
        
        // Prepping to make it easier
        String line = br.readLine().replaceAll(" ", "");
        for(int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(alphabet.contains(ch)) {
                alphabet.remove(ch);
                list.add(ch);
            }
        }
        list.addAll(alphabet);
        
        // Filling the grid
        HashMap<Character, Integer[]> hash = new HashMap<Character, Integer[]>();
        char[][] grid = new char[5][5];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                grid[i][j] = list.removeFirst();
                Integer[] in = {i, j};
                hash.put(grid[i][j], in);
            }
        }

        // Encoding
        char ch1 = '$';
        char ch2 = '$';
        
        StringBuilder sb = new StringBuilder();
        line = br.readLine().replaceAll(" ", "");
        for(int i = 0; i < line.length(); i++) {
            
            ch1 = line.charAt(i);

            // Setting up the digraph
            if(i + 1 < line.length()) {
                ch2 = line.charAt(i + 1);
                if(ch1 != ch2) {
                    i++;
                }else {
                    ch2 = 'x';                  
                }
            }else {
                ch2 = 'x';
            }
            
            // Finding encoded letters
            Integer[] coord1 = hash.get(ch1);
            Integer[] coord2 = hash.get(ch2);
            
            char out1 = '$';
            char out2 = '$';
            if(coord1[0] == coord2[0]) {
                out1 = grid[coord1[0]][(coord1[1] + 1) % 5];
                out2 = grid[coord2[0]][(coord2[1] + 1) % 5];
            }else if(coord1[1] == coord2[1]) {
                out1 = grid[(coord1[0] + 1) % 5][coord1[1]];
                out2 = grid[(coord2[0] + 1) % 5][coord2[1]];
            }else {
                out1 = grid[coord1[0]][coord2[1]];
                out2 = grid[coord2[0]][coord1[1]];              
            }

            sb.append((char)(out1 - 32));
            sb.append((char)(out2 - 32));
        }
        
        // Output
        System.out.println(sb);

        br.close();
    }

    private static HashSet<Character> fillHash() {
        
        HashSet<Character> alphabet = new HashSet<Character>();
                
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        
        return alphabet;
    }

}
