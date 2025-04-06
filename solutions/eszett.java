import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eszett {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String line = br.readLine();
        
        // Loop
        String lower = line.toLowerCase();
        int index1 = -1;
        int index2 = -1;
        for(int i = 0; i < line.length() - 1; i++) {
            
            if(line.charAt(i) == 'S' && line.charAt(i + 1) == 'S' && index1 == -1) {
                index1 = i;
                i++;
            }

            if((i + 1) < line.length() && line.charAt(i) == 'S' && line.charAt(i + 1) == 'S' && index1 != -1) {
                index2 = i;
                break;
            }
        }

        // Output

        sb.append(lower).append("\n");
        
        if(index1 != -1) {
            String lower1 = lower.substring(0, index1) + "B" + lower.substring(index1 + 2);
            sb.append(lower1).append("\n");
        }
        if(index2 != -1) {
            String lower2 = lower.substring(0, index2) + "B" + lower.substring(index2 + 2);
            sb.append(lower2);
        }

        System.out.println(sb);

        br.close();
    }

}
