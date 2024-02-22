import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pivot {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        
        String[] line = br.readLine().split(" ");
        int len = line.length;
        int[] nums = new int[len];
        
        // Checking the left on reading in
        int max = -1;
        boolean[] good = new boolean[len];
        for(int i = 0; i < line.length; i++) {
            
            int num = Integer.parseInt(line[i]);
            nums[i] = num;
            
            if(num > max) {
                good[i] = true;
                max = num;
            }
        }
        
        // Checking the right in reverse
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i = line.length - 1; i >= 0; i--) {
            int num = Integer.parseInt(line[i]);
            nums[i] = num;
            
            if(num < min) {
                min = num;
                
                if(good[i]) {
                    count++;
                }
            }
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
