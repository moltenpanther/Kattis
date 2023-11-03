import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bottledup {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int total = Integer.parseInt(line[0]);
        int vol1 = Integer.parseInt(line[1]);
        int vol2 = Integer.parseInt(line[2]);
        
        boolean good = false;
        for(int i = total; i >= 0 && !good; i -= vol2) {
            
            if(i % vol1 == 0) {
                int ans1 = i / vol1;
                int ans2 = (total - i) / vol2;
                
                System.out.println(ans1 + " " + ans2);
                good = true;
            }
            
        }
        
        if(!good) {
            System.out.println("Impossible");
        }

        br.close();
    }

}
