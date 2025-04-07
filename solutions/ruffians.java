import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ruffians {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        for(int i = 0; i < num; i++) {

            int[][] arr = new int[2][5];
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < 5; j++) {
                arr[0][j] = Integer.parseInt(line[j]);
            }
            line = br.readLine().split(" ");
            for(int j = 0; j < 5; j++) {
                arr[1][j] = Integer.parseInt(line[j]);
            }

            // Time to check for matches!
            boolean found = false;
            for(int j = 0; j < 5; j++) {
                for(int k = 0; k < 5; k++) {
                    if(arr[0][j] == arr[1][k] && j != k) {
                        found = true;
                        break;
                    }
                }
                if(found) {
                    break;
                }
            }

            if(found) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }

        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
