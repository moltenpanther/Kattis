import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mergjadmal {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        
        // Output
        if(line.contains("69") || line.contains("420")) {
            System.out.println("Mergjad!");
        }else {
            System.out.println("Leim!");
        }
        
        br.close();
    }

}
