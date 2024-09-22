import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class klosettrod {

    public static void main(String... args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        int[] urgencies = new int[num + 1];
        for(int i = 0; i < num; i++) {
            int urgency = Integer.parseInt(line[i]);
            urgencies[urgency] = i + 1; 
        }
        
        for(int i = num; i >= 1; i--) {
            sb.append(urgencies[i] + " ");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
        
    }
    
}
