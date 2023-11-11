import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class prjonamynstur {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        hash.put('.', 20);
        hash.put('O', 10);
        hash.put('\\', 25);
        hash.put('/', 25);
        hash.put('A', 35);
        hash.put('^', 5);
        hash.put('v', 22);
        
        String[] line = br.readLine().split(" ");
        int num1 = Integer.parseInt(line[0]);
        int num2 = Integer.parseInt(line[1]);
        
        int count = 0;
        for(int i = 0; i < num1; i++) {
            
            String in = br.readLine();
            for(int j = 0; j < num2; j++) {
                
                char ch = in.charAt(j);
                count +=  hash.get(ch);
            }
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
