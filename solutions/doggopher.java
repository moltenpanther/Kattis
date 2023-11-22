import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class doggopher {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        double gophX = Double.parseDouble(line[0]);
        double gophY = Double.parseDouble(line[1]);
        double dogX = Double.parseDouble(line[2]);
        double dogY = Double.parseDouble(line[3]);
        
        double holeX = 0;
        double holeY = 0;
        
        boolean good = false;
        String hole = "";
        while((hole = br.readLine()) != null && !good) {
            
            line = hole.split(" ");
            
            holeX = Double.parseDouble(line[0]);
            holeY = Double.parseDouble(line[1]);
            
            double gophDis = Math.sqrt(Math.pow(gophX - holeX, 2) + Math.pow(gophY - holeY, 2));
            double dogDis = Math.sqrt(Math.pow(dogX - holeX, 2) + Math.pow(dogY - holeY, 2));
            
            if(dogDis - (gophDis * 2) >= 0.000001) {
                good = true;
            }
        }
        
        // Output
        if(good) {
            System.out.printf("The gopher can escape through the hole at (%.3f,%.3f).", holeX, holeY);
        }else {
            System.out.println("The gopher cannot escape.");
        }
        
        br.close();
    }

}
