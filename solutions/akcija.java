import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class akcija {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());  
        
        int[] books = new int[num];
        for(int i = 0; i < num; i++) {
            int price = Integer.parseInt(br.readLine());  
            books[i] = price;
        }
        
        Arrays.sort(books);
        
        int total = 0;
        int count = 0;
        for(int i = num - 1; i >= 0; i--) {
            
            if(++count % 3 != 0) {
                total += books[i];
            }
            
        }
            
        // Output
        System.out.println(total);
        
        br.close();
    }

}
