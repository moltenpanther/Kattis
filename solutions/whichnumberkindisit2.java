import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class whichnumberkindisit2 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        for(int i = 0; i < num; i++) {
            
            boolean odd = false;
            boolean square = false;

            int val = Integer.parseInt(br.readLine());
            if(val % 2 != 0) {
                odd = true;
                sb.append("O");
            }

            int sqrt = (int) Math.sqrt(val);
            if(sqrt * sqrt == val) {
                square = true;
                sb.append("S");
            }
            
            if(!odd & !square) {
                sb.append("EMPTY");
            }

            sb.append("\n");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
