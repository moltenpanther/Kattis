import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class missingnumber {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= num; i++) {
            
            String numStr = String.valueOf(i);
            int len = numStr.length();
            
            String numBoard = "";
            for(int j = 0; j < len; j++) {
                numBoard += Character.valueOf((char)br.read());
            }

            if(!numStr.equals(numBoard)) {
                System.out.println(numStr);
                break;
            }
            
        }
        
        // Output
        System.out.println("");
        
        br.close();
    }

}

