import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class almostperfect {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String line = "";
        while((line = br.readLine()) != null) {
            
            int num = Integer.parseInt(line);
            
            int sum = 1;
            int end = num;
            
            // Find divisors
            for(int i = 2; i < end; i++) {
                if(num % i == 0) {
                    end = num / i;
                    sum += i;
                    if(end != i) {
                        sum += end;
                    }
                }
            }
            
            if(num == 1) {
                sum--;
            }

            sb.append(num);
            int dif = Math.abs(num - sum);
            
            if(dif <= 2 && dif != 0) {
                sb.append(" almost");
            }else if(dif > 2) {
                sb.append(" not");
            }
            sb.append(" perfect\n");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
