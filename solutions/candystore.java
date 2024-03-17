import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class candystore {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        HashMap<String, String> hash = new HashMap<String, String>();
        
        String[] line = br.readLine().split(" ");
        int names = Integer.parseInt(line[0]);
        int inits = Integer.parseInt(line[1]);
        
        // Getting names
        for(int i = 0; i < names; i++) {
            
            String name = br.readLine();
            line = name.split(" ");
            
            String initials = line[0].charAt(0) + "" + line[1].charAt(0);
            
            if(hash.containsKey(initials)) {
                hash.put(initials, "ambiguous");
            }else {
                hash.put(initials, name);
            }
            
        }
        
        // Checking initials
        for(int i = 0; i < inits; i++) {
            
            String init = br.readLine();
            if(hash.containsKey(init)) {
                sb.append(hash.get(init));
            }else {
                sb.append("nobody");
            }
            sb.append("\n");
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

}
