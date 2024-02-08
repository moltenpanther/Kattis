import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class blackfriday {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        int[] index = new int[7];
        int[] count = new int[7];
        
        for(int i = 0; i < num; i++) {
            int roll = Integer.parseInt(line[i]);
            count[roll]++;
            index[roll] = i;
        }
        
        // Check for top winner
        int winnerIndex = -1;
        for(int i = 6; i >= 1; i--) {
            if(count[i] == 1) {
                winnerIndex = i;
                i = 0;
            }
        }
        
        // Output
        if(winnerIndex > 0) {
            System.out.println(index[winnerIndex] + 1);
        }else {
            System.out.println("none");
        }
        
        br.close();
    }

}
