import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class thendaysofchristmas {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        int totalDay = 0;
        for(int i = 1; i <= num; i++) {
            totalDay += i;
        }
        
        int totalXmas = 0;
        int days = num;
        for(int i = 1; i <= num; i++) {
            totalXmas += i * days;
            days--;
        }

        // Output
        System.out.println(totalDay + "\n" + totalXmas);

        br.close();
    }

}
