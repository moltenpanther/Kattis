import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mork {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int goals = Integer.parseInt(br.readLine());
        int result = Integer.parseInt(br.readLine());

        // Output
        if(result == 0 || (result == 2 && goals == 2)) {
            sb.append("Jebb");
        }else{
            sb.append("Neibb");
        }
        System.out.println(sb);

        br.close();
    }

}
