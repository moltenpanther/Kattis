import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class rectanglesurrounding {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        while(num != 0) {
            
            boolean[][] grid = new boolean[501][501];
            int count = 0;
            
            for(int i = 0; i < num; i++) {
                
                String[] line = br.readLine().split(" ");
                int x1 = Integer.parseInt(line[0]);
                int y1 = Integer.parseInt(line[1]);
                int x2 = Integer.parseInt(line[2]);
                int y2 = Integer.parseInt(line[3]);
                
                for(int j = x1; j < x2; j++) {  
                    for(int k = y1; k < y2; k++) {
                        
                        if(!grid[j][k]) {
                            grid[j][k] = true;
                            count++;
                            
                            if(count > 250000) {
                                j = 501;
                                k = 501;
                            }
                        }
                    }   
                }
            }
            
            // Output
            System.out.println(count);
            
            
            num = Integer.parseInt(br.readLine());
            
        }   
        
        br.close();
    }

}
