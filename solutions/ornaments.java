import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ornaments {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        double radius = Double.parseDouble(line[0]);
        double height = Double.parseDouble(line[1]);
        double string = Double.parseDouble(line[2]);
        while(radius + height + string > 0) {
            
            double hyp = 2 * Math.sqrt(height * height - radius * radius);
            double angle = 2 * Math.PI - 2 * Math.acos(radius / height);
            double arc = angle * radius;
            
            double both = hyp + arc;
            double excess = (string / 100) * both;
            
            double ans = both + excess;
            
            // Output
            System.out.printf("%.2f\n", ans);

            line = br.readLine().split(" ");
            radius = Double.parseDouble(line[0]);
            height = Double.parseDouble(line[1]);
            string = Double.parseDouble(line[2]);
        }
        
        br.close();
    }

}
