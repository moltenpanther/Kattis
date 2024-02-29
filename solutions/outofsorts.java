import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class outofsorts {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        long mod = Long.parseLong(line[1]);
        long mult = Long.parseLong(line[2]);
        long plus = Long.parseLong(line[3]);
        long start = Long.parseLong(line[4]);
        
        long[] nums = new long[num];
        
        long last = start;
        
        // Calculating the sequence
        for(int i = 0; i < num; i++) {
            
            if(i > 0) {
                last = nums[i - 1];
            }
            long calc = ((mult * last) + plus) % mod;
            nums[i] = calc;
        }
        
        long count = 0;
        for(int i = 0; i < num; i++) {
            
            int find = (int)nums[i];
            int check = Arrays.binarySearch(nums, find);
            
            if(i == check) {
                count++;
            }
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }
    
}
