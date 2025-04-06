import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class egelskahann {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Josephus, finally!
        int highestPower = Integer.highestOneBit(num);
        int lastPetal = 2 * (num - highestPower) + 1;

        // Output
        System.out.println(lastPetal);

        br.close();
    }

}
