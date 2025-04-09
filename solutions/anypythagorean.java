import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class anypythagorean {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());

        boolean found = false;

        // Loop
        for (int a = 1; a <= num / 3; a++) {
            for (int b = a; b <= (num - a) / 2; b++) {
                int c = num - a - b;
                if (a * a + b * b == c * c) {
                    sb.append(a).append(" ").append(b).append(" ").append(c);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            sb.append("0 0 0");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
