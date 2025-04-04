import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class composedrhythms {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        int count = 0;
        if(num % 2 == 1) {
            sb.append("3 ");
            num -= 3;
            count++;
        }

        while(num > 0) {
            
            sb.append("2 ");
            num -= 2;
            
            count++;
        }

        // Output
        System.out.println(count + "\n" + sb);

        br.close();
    }

}
