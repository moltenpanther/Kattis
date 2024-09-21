import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bladra {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int total = Integer.parseInt(line[0]);
        int num = Integer.parseInt(line[1]);
        
        int[] problems = new int[total + 1];
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            int solved = Integer.parseInt(line[1]);
            
            problems[solved]++;
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= total; i++) {
            
            int score = problems[i];
            if(score < min) {
                min = score;
            }
        }
        
        // Output
        System.out.println(min);
        
        br.close();
    }

}
