import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inquiryi {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int lines = Integer.parseInt(br.readLine());
        long[] nums = new long[lines];
        
        // Getting sum
        long sum = 0;
        for(int i = 0; i < lines; i++) {
            long num = Integer.parseInt(br.readLine());
            nums[i] = num;
            sum += num;
        }
        
        // Getting squared sum and sliding the window across
        long max = -1;
        long sqSum = 0;
        for(int i = 0; i < lines; i++) {
            
            long num = nums[i];
            sum -= num;
            sqSum += (num * num);
            long check = sum * sqSum;
            if(check > max) {
                max = check;
            }
        }
        
        // Output
        System.out.println(max);
        
        br.close();
    }

}
