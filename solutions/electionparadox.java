import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class electionparadox {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int regions = Integer.parseInt(br.readLine());
        String[] votesStr = br.readLine().split(" ");
        int[] votes = new int[regions];
        
        for(int i = 0; i < regions; i++) {
            votes[i] = Integer.parseInt(votesStr[i]);
        }
        
        Arrays.sort(votes);
        
        int sum = 0;
        for(int i = 0; i < regions; i++) {
            
            if(i <= regions / 2) {
                sum += votes[i] / 2;
            }else {
                sum += votes[i];
            }
            
        }
        
        // Output
        System.out.println(sum);
        
        br.close();
    }

}
