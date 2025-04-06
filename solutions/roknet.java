import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class roknet {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        HashMap<String, Boolean> map = new HashMap<>();
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            String cmd = line[0];
            String obj = line[1];
            
            // INPUT
            if(cmd.charAt(0) == 'I') {

                boolean val = line[2].charAt(0) == 'S';
                if(map.containsKey(obj)) {
                    map.put(obj, map.get(obj) || val);
                } else {
                    map.put(obj, val);
                }
            // AND
            } else if(cmd.charAt(0) == 'O') {

                String obj2 = line[2];
                String out = line[3];
                if(map.get(obj) && map.get(obj2)) {
                    map.put(out, true);
                } else {
                    map.put(out, false);
                }
            // OR
            } else if(cmd.charAt(1) == 'D') {
                              
                String obj2 = line[2];
                String out = line[3];
                if(map.get(obj) || map.get(obj2)) {
                    map.put(out, true);
                } else {
                    map.put(out, false);
                }
            // NOT
            } else if(cmd.charAt(1) == 'K') {
                    
                String out = line[2];
                if(map.get(obj)) {
                    map.put(out, false);
                } else {
                    map.put(out, true);
                }
            // OUTPUT
            } else if(cmd.charAt(0) == 'U') {

                sb.append(obj + " ");
                if(!map.get(obj)) {
                    sb.append("O");
                }
                sb.append("SATT\n");

            }

        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
