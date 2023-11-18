import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pallatolur {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        
        if(num1 <= 2 && num2 >= 2) {
            System.out.println(1 + "\n" + 2);
        }else {
            System.out.println(":(");
        }
        
        br.close();
    }

}
