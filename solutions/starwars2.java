import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class starwars2 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        Arrays.sort(arr);

        // Loop
        for(int i = num / 3; i < 2 * num / 3; i++) {
            sb.append(arr[i] + " ");
        }

        for(int i = 0; i < num / 3; i++) {
            sb.append(arr[i] + " ");
        }

        for(int i = 2 * num / 3; i < num; i++) {
            sb.append(arr[i] + " ");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
