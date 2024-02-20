import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class password {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        double[] probs = new double[num];
        for(int i = 0; i < num; i++) {
            String[] line = br.readLine().split(" ");
            double prob = Double.parseDouble(line[1]);
            probs[i] = prob;
        }
        
        Arrays.sort(probs);
        
        int count = 0;
        double total = 0;
        for(int i = num - 1; i >= 0; i--) {
            total += probs[i] * ++count;
        }
        
        // Output
        System.out.println(total);
        
        br.close();
    }

}
