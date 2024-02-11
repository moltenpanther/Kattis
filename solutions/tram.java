import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tram {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        
        double sum = 0;
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            double x = Double.parseDouble(line[0]);
            double y = Double.parseDouble(line[1]);
            
            sum += (y - x);
        }
        
        // Output
        double ans = sum / num;
        System.out.println(ans);
        
        br.close();
    }

}
