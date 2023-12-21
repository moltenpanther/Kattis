import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tracksmoothing {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            double rad = Double.parseDouble(line[0]);
            int points = Integer.parseInt(line[1]);
            
            double around = 2 * Math.PI * rad;
            
            // Reading in coordinates
            int[] xCoords = new int[points];
            int[] yCoords = new int[points];
            
            for(int j = 0; j < points; j++) {
                
                String[] coord = br.readLine().split(" ");
                int x = Integer.parseInt(coord[0]);
                int y = Integer.parseInt(coord[1]);
                
                xCoords[j] = x;
                yCoords[j] = y;
            }
            
            // Track length calculations
            double length = 0;
            for(int j = 0; j < points - 1; j++) {
                
                double xDis = xCoords[j] - xCoords[j + 1];
                double yDis = yCoords[j] - yCoords[j + 1];
                
                double dis = Math.sqrt(Math.pow(xDis, 2) + Math.pow(yDis, 2));
                length += dis;
                
            }
            
            double xDis = xCoords[points - 1] - xCoords[0];
            double yDis = yCoords[points - 1] - yCoords[0];
            
            double dis = Math.sqrt(Math.pow(xDis, 2) + Math.pow(yDis, 2));
            length += dis;
            
            // Output
            if(around > length) {
                System.out.println("Not possible");
            }else {
                double factor = (length - around) / length;
                System.out.println(factor);
            }
            
        }
        
        
        br.close();
    }

}
