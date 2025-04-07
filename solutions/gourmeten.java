import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gourmeten {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int target = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());

        // Loop
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            for (int n : nums) {
                if (i >= n) {
                    dp[i] += dp[i - n];
                }
            }
        }

        // Output
        System.out.println(dp[target]);

        br.close();
    }

}
