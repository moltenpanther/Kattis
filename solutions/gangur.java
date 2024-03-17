import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gangur {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        
        int left = 0;
        for(int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(ch == '<') {
                left++;
            }
        }
        
        long total = 0;
        for(int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if(ch == '<') {
                left--;
            }else if(ch == '>') {
                total += left;
            }
        }
        
        // Output
        System.out.println(total);
        
        br.close();
    }

}
