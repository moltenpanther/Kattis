import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class waterjournal {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        
        int num = Integer.parseInt(line[0]);
        int minLog = Integer.parseInt(line[1]);
        int maxLog = Integer.parseInt(line[2]);
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < num - 1; i++) {
            int logged = Integer.parseInt(br.readLine());
            if(logged < min) {
                min = logged;
            }
            if(logged > max) {
                max = logged;
            }
        }
        
        // Output
        if(min != minLog && max != maxLog) {
            System.out.println(-1);
        }else if(min != minLog) {
            System.out.println(minLog);
        }else if(max != maxLog) {
            System.out.println(maxLog);
        }else {
            for(int i = minLog; i <= maxLog; i++) {
                System.out.println(i);
            }
        }

        br.close();
    }

}
