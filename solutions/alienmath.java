import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class alienmath {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        int base = Integer.parseInt(br.readLine());
        
        // Reading input
        String[] line = br.readLine().split(" ");
        for(int i = 0; i < base; i++) {
            String num = line[i];
            hash.put(num, i);
        }
        
        // Processing alienNum
        String alienNum = br.readLine();
        LinkedList<String> nums = new LinkedList<String>();
        
        for(int i = 0; i < alienNum.length(); i++) {
            String sub = "";
            while(!hash.containsKey(sub)) {
                sub += alienNum.charAt(i++);
            }
            
            nums.add(sub);
            i--;
        }
        
        // Calculating decimal
        int out = 0;
        int exp = nums.size() - 1;
        for(int i = 0; i < nums.size(); i++) {
            
            int num = hash.get(nums.get(i));
            int pow = (int) Math.pow(base, exp--);
            
            out += num * pow;
        }
        
        // Output
        System.out.println(out);
        
        br.close();
    }

}
