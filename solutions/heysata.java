import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class heysata {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        br.readLine();
        String ch = br.readLine();
        String line = br.readLine();

        sb.append("Unnar fann hana");
        // Loop
        if(!line.contains(ch)) {
            sb.append(" ekki");
        }
        sb.append("!");

        // Output
        System.out.println(sb);

        br.close();
    }

}
