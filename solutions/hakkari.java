import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hakkari {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        
        int count = 0;
        for(int i = 0; i < rows; i++) {
            
            String row = br.readLine();
            for(int j = 0; j < cols; j++) {
                char col = row.charAt(j);
                if(col == '*') {
                    sb.append((i + 1) + " " + (j + 1) + "\n");
                    count++;
                }
            }
        }
        
        // Output
        System.out.println(count);
        System.out.println(sb);
        
        br.close();
    }

}
