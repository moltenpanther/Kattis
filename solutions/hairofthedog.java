import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hairofthedog {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        int count = 0;
        char chPrev = br.readLine().charAt(0);
        for(int i = 1; i < num; i++) {
            
            char ch = br.readLine().charAt(0);
            if(chPrev == 's' && ch == 'd') {
                count++;
            }

            chPrev = ch;
        }

        // Output
        System.out.println(count);

        br.close();
    }

}
