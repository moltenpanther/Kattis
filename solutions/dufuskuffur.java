import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dufuskuffur {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        // Output
        if(num1 > num2) {
            sb.append("Dufur passa ekki");
        } else if(num1 < num2) {
            sb.append("Dufur passa");
        } else {
            sb.append("Dufur passa fullkomlega");
        }

        System.out.println(sb);

        br.close();
    }

}
