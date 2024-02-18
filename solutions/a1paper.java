import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1paper {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading input
        int num = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        int[] paper = new int[num];
        for(int i = 1; i < num; i++) {
            paper[i] = Integer.parseInt(line[i - 1]);
        }
        
        // Size values
        double sideL = .5946035575013605;
        double sideS = .42044820762685725;
        double sqrt2 = Math.sqrt(2);
        
        int need = 1;
        
        // Looping through and calculating
        boolean good = true;
        double sum = 0;
        for(int i = 1; i < num && good; i++) {
            
            sum += sideL * need;
            
            sideS = sideL / 2;
            sideL = sqrt2 * sideS;
        
            need = (need * 2) - paper[i];
            if(need < 1) {
                good = false;
            }
        }
        
        // Output
        if(good) {
            System.out.println("impossible");
        }else {
            System.out.println(sum);
        }
        
        br.close();
    }

}
