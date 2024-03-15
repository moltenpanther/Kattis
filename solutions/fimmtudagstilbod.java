import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fimmtudagstilbod {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int year = Integer.parseInt(br.readLine());
        
        int price = 1000;
        if(year > 2020) {
            int dif = year - 2020;
            price += dif * 100;
        }
        
        // Output
        System.out.println(price);
        
        br.close();
    }

}
