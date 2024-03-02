import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bottleflip {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        double height = Double.parseDouble(line[0]);
        double densityAir = Double.parseDouble(line[2]);
        double densityWater = Double.parseDouble(line[3]);
        
        double nom = height * Math.sqrt(densityAir);
        double denom = Math.sqrt(densityAir) + Math.sqrt(densityWater);
        
        double out = nom / denom;
        // Output
        System.out.println(out);
        
        br.close();
    }

}
