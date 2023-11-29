import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kikiboba {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        
        int b = 0;
        int k = 0;
        for(int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(ch == 'b') {
                b++;
            }else if(ch == 'k') {
                k++;
            }
        }
        
        String ans = "";
        if(b > k) {
            ans = "boba";
        }else if(b < k) {
            ans = "kiki";
        }else if(b == k) {
            if(b != 0) {
                ans = "boki";               
            }else {
                ans = "none";
            }
        }
        
        // Output
        System.out.println(ans);
        
        br.close();
    }

}
