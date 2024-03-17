import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class keysphonewallet {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        HashSet<String> items = new HashSet<String>();
        
        // rReading input
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            String item = br.readLine();
            items.add(item);
        }
        
        // Checking pockets
        if(!items.contains("keys")) {
            sb.append("keys");
            sb.append("\n");
        }
        if(!items.contains("phone")) {
            sb.append("phone");
            sb.append("\n");
        }
        if(!items.contains("wallet")) {
            sb.append("wallet");
            sb.append("\n");
        }
        
        if(sb.isEmpty()) {
            sb.append("ready");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
