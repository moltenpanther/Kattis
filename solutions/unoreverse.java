import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class unoreverse {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int players = Integer.parseInt(line[0]);
        int revs = Integer.parseInt(line[1]);
        
        // Output
        if(revs % 2 == 0 && revs / 2 + 2 <= players) {
            System.out.println("NO");           
        }else if(revs == 1 || players == 2) {
            System.out.println("YES");
        }else {
            System.out.println("MAYBE");
        }
        
        br.close();
    }

}
