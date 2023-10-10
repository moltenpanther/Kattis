import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dartscores {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++) {
            
            int darts = Integer.parseInt(br.readLine());
            int points = 0;
            for(int j = 0; j < darts; j++) {
                
                String[] line = br.readLine().split(" ");
                int x = Integer.parseInt(line[0]);
                int y = Integer.parseInt(line[1]);
                
                double dist = Math.sqrt(x * x + y * y);
                
                if(dist <= 20) {
                    points += 10;
                }else if(dist <= 40) {
                    points += 9;
                }else if(dist <= 60) {
                    points += 8;
                }else if(dist <= 80) {
                    points += 7;
                }else if(dist <= 100) {
                    points += 6;
                }else if(dist <= 120) {
                    points += 5;
                }else if(dist <= 140) {
                    points += 4;
                }else if(dist <= 160) {
                    points += 3;
                }else if(dist <= 180) {
                    points += 2;
                }else if(dist <= 200) {
                    points += 1;
                }
                
            }
            
            System.out.println(points);
            
        }
        
        // Output
        System.out.println("");
        
        br.close();
    }

}

