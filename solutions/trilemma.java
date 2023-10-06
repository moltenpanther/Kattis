import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trilemma {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            // Reading in the coords
            String[] line = br.readLine().split(" ");
            double[] x = new double[3];
            double[] y = new double[3];
            
            for(int j = 0; j < 3; j++) {
                x[j] = Double.parseDouble(line[2 * j]);
                y[j] = Double.parseDouble(line[(2 * j) + 1]);               
            }
            
            String start = "Case #" + (i + 1) + ": ";
            String middle = "";
            String end = " triangle";
            
            double epsilon = .000001;
            // Checking if it's a triangle by comparing slopes
            
            double slope1 = Double.MAX_VALUE;
            double slope2 = Double.MAX_VALUE;
            double slope3 = Double.MAX_VALUE;
            
            if(x[0] - x[1] != 0){
                slope1 = (y[0] - y[1]) / (x[0] - x[1]);             
            }
            if(x[1] - x[2] != 0) {
                slope2 = (y[1] - y[2]) / (x[1] - x[2]);         
            }
            if(x[0] - x[2] != 0) {
                slope3 = (y[0] - y[2]) / (x[0] - x[2]);             
            }
            
            if(Math.abs(slope1 - slope2) < epsilon || Math.abs(slope1 - slope3) < epsilon || Math.abs(slope2 - slope3) < epsilon) {
                middle = "not a";
                
            }else {
            
                // Checking all three distances
                double[] dis = new double[3];
                
                dis[0] = Math.sqrt(Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2));
                dis[1] = Math.sqrt(Math.pow(x[0] - x[2], 2) + Math.pow(y[0] - y[2], 2));
                dis[2] = Math.sqrt(Math.pow(x[1] - x[2], 2) + Math.pow(y[1] - y[2], 2));
                
                if(Math.abs(dis[0] - dis[1]) < epsilon && Math.abs(dis[1] - dis[2]) < epsilon && Math.abs(dis[0] - dis[2]) < epsilon) {
                    middle += "equilateral ";
                }else if(Math.abs(dis[0] - dis[1]) < epsilon || Math.abs(dis[1] - dis[2]) < epsilon || Math.abs(dis[0] - dis[2]) < epsilon) {
                    middle += "isosceles ";
                }else {
                    middle += "scalene ";
                }
                            
                // Checking all three angles
                double[] angle = new double[3];
    
                double top = Math.pow(dis[0], 2) + Math.pow(dis[1],  2) - Math.pow(dis[2], 2);
                double bottom = 2 * dis[0] * dis[1];
                angle[0] = Math.toDegrees(Math.acos(top / bottom));
                
                top = Math.pow(dis[0], 2) + Math.pow(dis[2],  2) - Math.pow(dis[1], 2);
                bottom = 2 * dis[0] * dis[2];
                angle[1] = Math.toDegrees(Math.acos(top / bottom));
                
                top = Math.pow(dis[1], 2) + Math.pow(dis[2],  2) - Math.pow(dis[0], 2);
                bottom = 2 * dis[1] * dis[2];
                angle[2] = Math.toDegrees(Math.acos(top / bottom));
                
                boolean acute = true;
                for(int j = 0; j < 3 && acute; j++) {
                    double ang = angle[j];
                    if(Math.abs(ang - 90) < epsilon) {
                        middle += "right";
                        acute = false;
                    }else if(ang > 90) {
                        middle += "obtuse";
                        acute = false;
                    }
                }
                
                if(acute) {
                    middle += "acute";
                }
                
            }
            
            // Output
            System.out.println(start + middle + end);

        }
        
        br.close();
    }

}
