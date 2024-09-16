import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class shortcuttowhat {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        
        num += 5;
        num *= 3;
        num -= 10;

        // Output
        System.out.println(num);

        br.close();
    }

}
