import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class takkar {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int numT = Integer.parseInt(br.readLine());
        int numK = Integer.parseInt(br.readLine());
        
        // Output
        if(numT > numK) {
            System.out.println("MAGA!");
        }else if(numK > numT) {
            System.out.println("FAKE NEWS!");
        }else {
            System.out.println("WORLD WAR 3!");
        }  
        
        br.close();
    }

}
