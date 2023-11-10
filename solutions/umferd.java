import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class umferd {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int total = num1 * num2;
        
        int count = 0;
        for(int i = 0; i < num2; i++) {
            
            String line = br.readLine();
            for(int j = 0; j < num1; j++) {
                if(line.charAt(j) == '.') {
                    count++;
                }
            }
        }
        
        // Output
        System.out.println((double) count / (double) total);
        
        br.close();
    }

}
