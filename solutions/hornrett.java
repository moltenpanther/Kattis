import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hornrett {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        
        long[] nums = new long[3];
        for(int i = 0; i < 3; i++) {
            nums[i] = Long.parseLong(line[i]);
        }

        if(nums[0] * nums[0] + nums[1] * nums[1] == nums[2] * nums[2]) {
            
            long area = nums[0] * nums[1] / 2;
            sb.append(area);
            
        } else {
            sb.append("-1");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
