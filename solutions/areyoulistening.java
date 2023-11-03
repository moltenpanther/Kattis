import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class areyoulistening {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int hereX = Integer.parseInt(line[0]);
        int hereY = Integer.parseInt(line[1]);
        
        int num = Integer.parseInt(line[2]);
        int[] dists = new int[num];
        
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int rad = Integer.parseInt(line[2]);
            
            int dist = (int) Math.sqrt(Math.pow(hereX - x, 2) + Math.pow(hereY - y, 2)) - rad;
            dists[i] = dist;
        }
        
        Arrays.sort(dists);
        
        int ans = dists[2];
        if(ans < 0) {
            ans = 0;
        }
        
        // Output
        System.out.println(ans);
        
        br.close();
    }

}
