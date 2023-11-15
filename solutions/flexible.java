import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;

public class flexible {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int max = Integer.parseInt(line[0]);
        int num = Integer.parseInt(line[1]);
        
        int[] nums = new int[num + 2];
        nums[0] = 0;
        nums[num + 1] = max;
        
        line = br.readLine().split(" ");
        for(int i = 0; i < num; i++) {
            nums[i + 1] = Integer.parseInt(line[i]);
        }
        
        HashSet<Integer> hash = new HashSet<Integer>();
        PriorityQueue<Integer> difs = new PriorityQueue<Integer>();
        
        // Subtracting
        for(int i = num + 1; i > 0; i--) {
            for(int j = i - 1; j >= 0; j--) {
                int dif = nums[i] - nums[j];
                if(!hash.contains(dif)) {
                    hash.add(dif);
                    difs.add(dif);
                }
            }
        }
        
        // Output
        while(!difs.isEmpty()) {
            System.out.print(difs.poll() + " ");            
        }
        
        br.close();
    }

}
