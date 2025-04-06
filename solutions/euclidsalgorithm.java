import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class euclidsalgorithm {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        Long a = Long.parseLong(line[0]);
        Long b = Long.parseLong(line[1]);

        // Euclid's
        Long gcd = gcd(a, b);

        // Output
        System.out.println(gcd);

        br.close();
    }

    private static Long gcd(Long a, Long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
