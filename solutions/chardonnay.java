import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chardonnay {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Output
        if(num == 0) {
            System.out.println(0);
        } else if (num == 7) {
            System.out.println(num);
        } else {
            System.out.println(num + 1);
        }

        br.close();
    }

}
