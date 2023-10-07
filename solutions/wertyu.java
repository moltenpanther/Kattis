import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class wertyu {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Hashtable<Character, Character> keys = getKeys();
        StringBuilder sb = new StringBuilder();
        
        String line = "";
        while((line = br.readLine()) != null) {         
            for(int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                sb.append(keys.get(ch));
                // Output
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
        
        br.close();
    }

    private static Hashtable<Character, Character> getKeys() {
        
        Hashtable<Character, Character> keys = new Hashtable<Character, Character>();
        
        keys.put('1', '`');
        keys.put('2', '1');
        keys.put('3', '2');
        keys.put('4', '3');
        keys.put('5', '4');
        keys.put('6', '5');
        keys.put('7', '6');
        keys.put('8', '7');
        keys.put('9', '8');
        keys.put('0', '9');
        keys.put('-', '0');
        keys.put('=', '-');
        keys.put('W', 'Q');
        keys.put('E', 'W');
        keys.put('R', 'E');
        keys.put('T', 'R');
        keys.put('Y', 'T');
        keys.put('U', 'Y');
        keys.put('I', 'U');
        keys.put('O', 'I');
        keys.put('P', 'O');
        keys.put('[', 'P');
        keys.put(']', '[');
        keys.put('\\', ']');
        keys.put('S', 'A');
        keys.put('D', 'S');
        keys.put('F', 'D');
        keys.put('G', 'F');
        keys.put('H', 'G');
        keys.put('J', 'H');
        keys.put('K', 'J');
        keys.put('L', 'K');
        keys.put(';', 'L');
        keys.put('\'', ';');
        keys.put('X', 'Z');
        keys.put('C', 'X');
        keys.put('V', 'C');
        keys.put('B', 'V');
        keys.put('N', 'B');
        keys.put('M', 'N');
        keys.put(',', 'M');
        keys.put('.', ',');
        keys.put('/', '.');
        keys.put(' ', ' ');
            
        return keys;
    }

}

