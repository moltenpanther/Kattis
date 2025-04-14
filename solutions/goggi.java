import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class goggi {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        int num1 = Integer.parseInt(line[0]);
        int num2 = Integer.parseInt(line[2]);

        // Output
        if(num1 > num2) {
            sb.append(">");
        } else if(num1 < num2) {
            sb.append("<");
        } else {
            sb.append("Goggi svangur!");
        }
        
        System.out.println(sb);

        br.close();
    }

}
