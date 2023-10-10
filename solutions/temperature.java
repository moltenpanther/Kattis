import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class temperature {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        double X = Double.parseDouble(line[0]); // slope
        double Y = Double.parseDouble(line[1]); // intercept
        
        if(Y == 1) {
            if(X == 0) {
                System.out.println("ALL GOOD");
            }else {
                System.out.println("IMPOSSIBLE");               
            }
        }else {
            double ans = X / (1 - Y);
            System.out.println(ans);
        }
        
        // Output
        System.out.println("");
        
        br.close();
    }

}
