import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class marswindow {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int year = Integer.parseInt(br.readLine());
        
        boolean mars = false;
        
        int count = 0;
        int month = 3;
        for(int i = 2018; i <= year; i++) {
            
            for(int j = month; j < 12; j++) {
                
                count++;
                if(count == 26) {
                    if(i == year) {
                        mars = true;
                    }
                    count = 0;
                }
                
            }
            
            month = 0;
        }
        
        // Output
        if(mars || year == 2018) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        
        br.close();
    }

}

