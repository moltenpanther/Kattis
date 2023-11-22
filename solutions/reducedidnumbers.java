import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class reducedidnumbers {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        
        int[] nums = new int[num];
        
        for(int i = 0; i < num; i++) {
            int id = Integer.parseInt(br.readLine());
            nums[i] = id;
        }
        
        int count = 1;
        boolean good = false;
        while(!good) {
            
            good = true;
            HashSet<Integer> hash = new HashSet<Integer>();
            for(int i = 0; i < num; i++) {
                
                int mod = nums[i] % count;
                if(hash.contains(mod)) {
                    good = false;
                    count++;
                    break;
                }else {
                    hash.add(mod);
                }
            }
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
