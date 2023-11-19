import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tutorial {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int limit = Integer.parseInt(line[0]);
        int max = Integer.parseInt(line[1]);
        int algo = Integer.parseInt(line[2]);
        
        long time = 1;
        boolean good = true;
        if(algo == 1) {
            
            for(int i = max; i >= 1; i--) {
                time *= i;
                if(time > limit) {
                    good = false;
                    break;
                }
            }
            
        }else if(algo == 2) {
            
            for(int i = 0; i < max; i++) {
                time *= 2;
                if(time > limit) {
                    good = false;
                    break;
                }
            }
            
        }else if(algo == 3) {
            
            for(int i = 0; i < 4; i++) {
                time *= max;
                if(time > limit) {
                    good = false;
                    break;
                }
            }
            
        }else if(algo == 4) {
            
            for(int i = 0; i < 3; i++) {
                time *= max;
                if(time > limit) {
                    good = false;
                    break;
                }
            }
            
        }else if(algo == 5) {
            
            for(int i = 0; i < 2; i++) {
                time *= max;
                if(time > limit) {
                    good = false;
                    break;
                }
            }
            
        }else if(algo == 6) {
            
            double log = (Math.log(max) / Math.log(2));
            
            time = (long)Math.ceil(max * log);
            if(time > limit) {
                good = false;
            }
            
            
        }else if(algo == 7) {
            if(max > limit) {
                good = false;
            }
        }
        
        if(good) {
            System.out.println("AC");
        }else {
            System.out.println("TLE");
        }
        
        // Output
        System.out.println("");
        
        br.close();
    }

}
