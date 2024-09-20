import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class namnsdag {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String friend = br.readLine();
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++) {
            
            String name = br.readLine();
            if(name.length() == friend.length()) {
                
                int dif = 0;
                for(int j = 0; j < friend.length() && dif < 2; j++) {
                    if(name.charAt(j) != friend.charAt(j)) {
                        dif++;
                    }
                }
                
                // Output
                if(dif < 2) {
                    System.out.println(i + 1);
                    i = num;
                }
            }
        }
        
        br.close();
    }

}
