import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class blandadbest {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String meat = br.readLine();
        
        // Output
        if(num == 1) {
            System.out.println(meat);
        }else{
            System.out.println("blandad best");
        }
        
        br.close();
    }

}
