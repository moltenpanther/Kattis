import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class akureyri {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < num; i++) {
            br.readLine();
            String location = br.readLine();

            if(map.containsKey(location)) {
                map.put(location, map.get(location) + 1);
            } else {
                map.put(location, 1);
            }
        }

        // Output
        for(String key : map.keySet()) {
            sb.append(key).append(" ").append(map.get(key)).append("\n");
        }

        System.out.println(sb);

        br.close();
    }

}
