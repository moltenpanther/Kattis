import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class eiginnofn {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String, String> names = new HashMap<String, String>();
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            String first = line[0];
            
            String last = "";
            if(line.length > 1) {
                last = line[1];
            }
            
            names.put(first, last);
        }
        
        num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String first = br.readLine();
            if(names.containsKey(first)) {
                
                String last = names.get(first);
                if(last.length() == 0) {
                    sb.append("Jebb\n");
                }else {
                    sb.append("Neibb en " + first + " " + last + " er heima\n");
                }
                
            }else {
                sb.append("Neibb\n");
            }
            
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
