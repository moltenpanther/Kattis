import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class xorsist {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        long num = Long.parseLong(br.readLine());
        long possessed = -1;

        int mod = (int)(num % 4);

        if(mod == 0) {
            possessed = num;
        }else if(mod == 1) {
            possessed = 1;
        }else if(mod == 2) {
            possessed = num + 1;
        }else {
            possessed = 0;
        }
        
        // Output
        if(possessed == 0) {
            sb.append("Enginn");
        } else if(possessed <= num) {
            sb.append(possessed);
        } else {
            sb.append("Gunnar");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
