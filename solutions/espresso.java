import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class espresso {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int tankMax = Integer.parseInt(line[1]);
        
        int tank = tankMax;
        int count = 0;
        for(int i = 0; i < num; i++) {
                        
            String order = br.readLine();
            
            int water = Integer.parseInt(order.substring(0, 1));
            if(order.length() > 1) {
                water++;
            }
            
            if(tank - water < 0) {
                count++;
                tank = tankMax;
            }
            tank -= water;
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
