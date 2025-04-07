import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nafnagift {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String a = br.readLine();
        String b = br.readLine();
        int n = a.length();
        int m = b.length();

        // Least Common Subsequence!
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
            
        }

        // Shortest Common Supersequence!
        int i = n;
        int j = m;
        while (i > 0 && j > 0) {

            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                sb.append(a.charAt(i - 1));
                i--; 
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                sb.append(a.charAt(i - 1));
                i--;
            } else {
                sb.append(b.charAt(j - 1));
                j--;
            }

        }

        // Add the extras
        while (i > 0) {
            sb.append(a.charAt(--i));
        }
        while (j > 0) {
            sb.append(b.charAt(--j));
        }

        // Output
        System.out.println(sb.reverse().toString());

        br.close();
    }

}
