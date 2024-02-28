import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class inflation {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        
        String[] line = br.readLine().split(" ");
        int[] nums = new int[line.length];
        
        // Reading input
        for(int i = 0; i < line.length; i++) {
            int num = Integer.parseInt(line[i]);
            nums[i] = num;
        }
        
        Arrays.sort(nums);
        
        // Calculating minimum
        double min = Integer.MAX_VALUE;
        for(int i = 1; i <= line.length; i++) {
            
            int num = nums[i - 1];
            
            if(i < num) {
                System.out.println("impossible");
                System.exit(0);
            }
            
            double frac = (double)num / (double)i;
            if(frac < min) {
                min = frac;
            }
        }
        
        // Output
        System.out.println(min);
        
        br.close();
    }

}
