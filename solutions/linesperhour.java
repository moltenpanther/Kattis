import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class linesperhour {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int lph = Integer.parseInt(line[1]) * 5;
        
        int[] times = new int[num];
        for(int i = 0; i < num; i++) {
            times[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(times);
        
        int total = 0;
        int count = 0;
        for(int i = 0; i < num; i++) {
            
            total += times[i];
            if(total > lph) {
                i = num;
            }else {
                count++;
            }
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
