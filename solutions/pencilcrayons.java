import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class pencilcrayons {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        
        int count = 0;
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            HashSet<String> colors = new HashSet<String>();
            
            for(int j = 0; j < line.length; j++) {
                String color = line[j];
                if(colors.contains(color)) {
                    count++;
                }else {
                    colors.add(color);
                }
            }
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
