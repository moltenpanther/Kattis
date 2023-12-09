import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class meddelande {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int row = Integer.parseInt(line[0]);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < row; i++) {
            
            String inp = br.readLine();
            for(int j = 0; j < inp.length(); j++) {
                char ch = inp.charAt(j);
                if(ch != '.') {
                    sb.append(ch);
                }
            }
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
