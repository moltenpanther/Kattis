import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ferskastajarmid {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        int maxFresh = -1;
        String freshest = "";
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            String meme = line[0];
            int controversiality = Integer.parseInt(line[1]);
            int coolness = Integer.parseInt(line[2]);
            
            int freshness = controversiality * coolness;
            if(freshness > maxFresh) {
                maxFresh = freshness;
                freshest = meme;
            }else if(freshness == maxFresh) {
                if(meme.compareTo(freshest) < 0) {
                    freshest = meme;
                }
            }
        }
        
        // Output
        System.out.println(freshest);
        
        br.close();
    }

}
