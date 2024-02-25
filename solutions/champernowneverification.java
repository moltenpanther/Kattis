import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class champernowneverification {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        hash.put(1, 1);
        hash.put(12, 2);
        hash.put(123, 3);
        hash.put(1234, 4);
        hash.put(12345, 5);
        hash.put(123456, 6);
        hash.put(1234567, 7);
        hash.put(12345678, 8);
        hash.put(123456789, 9);
        
        int num = Integer.parseInt(br.readLine());
        if(hash.containsKey(num)) {
            System.out.println(hash.get(num));
        }else {
            System.out.println(-1);
        }
        
        // Output
        System.out.println("");
        
        br.close();
    }

}
