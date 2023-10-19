import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mountainbiking {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        double grav = Double.parseDouble(line[1]) * 2;
        
        String[] slopes = new String[num];
        for(int i = 0; i < num; i++) {
            slopes[i] = br.readLine();
        }
        
        double[] vels = new double[num];
        
        double prevVel = 0;
        for(int i = num - 1; i >= 0; i--) {
            
            String[] slope = slopes[i].split(" ");
            double dis = Double.parseDouble(slope[0]);
            double angle = Double.parseDouble(slope[1]);
            
            double velSq = prevVel + grav * dis * Math.cos(Math.toRadians(angle));
            prevVel = velSq;
            
            double vel = Math.sqrt(velSq);
            vels[i] = vel;
        }
        
        // Output
        for(double vel : vels) {
            System.out.printf("%.5f\n", vel);
        }
        
        br.close();
    }

}

