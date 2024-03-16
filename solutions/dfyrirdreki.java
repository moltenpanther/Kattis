import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dfyrirdreki {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        int disc = b * b - 4 * a * c;
        
        // Output
        if(disc > 0) {
            System.out.println(2);          
        }else if(disc == 0) {
            System.out.println(1);          
        }else {
            System.out.println(0);
        }
        
        br.close();
    }

}
