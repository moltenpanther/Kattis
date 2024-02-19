import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class toflur {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        String[] line = br.readLine().split(" ");
        int len = line.length;
        
        long[] nums = new long[len];
        for(int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        
        Arrays.sort(nums);
        
        long sum = 0;
        for(int i = 1; i < len; i++) {
            long sqDif = (long) Math.pow(nums[i] - nums[i - 1], 2);
            sum += sqDif;
        }
        
        // Output
        System.out.println(sum);
        
        br.close();
    }

}
