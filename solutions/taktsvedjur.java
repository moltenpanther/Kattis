import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class taktsvedjur {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        
        int inarow = 0;
        int mult = 1;
        long total = 0;
        for(int i = 0; i < num; i++) {
            
            int score = Integer.parseInt(br.readLine());
            
            // Hit!
            if(score > 0) {
                
                inarow++;
                if(mult == 1) {
                    if(inarow == 2) {
                        mult *= 2;
                        inarow = 0;
                    }
                }else if(mult == 2) {
                    if(inarow == 4) {
                        mult *= 2;
                        inarow = 0;
                    }
                }else if(mult == 4) {
                    if(inarow == 8) {
                        mult *= 2;
                        inarow = 0;
                    }
                }
                
                total += score * mult;
                
            // Miss!
            }else {
                inarow = 0;
                if(mult > 1) {
                    mult /= 2;
                }
            }
        }
        
        // Output
        System.out.println(total);
        
        br.close();
    }

}
