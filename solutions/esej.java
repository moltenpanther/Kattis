import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class esej {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        char[] vows = {'a', 'e', 'i', 'o', 'u'};
        char[] cons = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        
        String[] line = br.readLine().split(" ");
        int num1 = Integer.parseInt(line[0]);
        int num2 = Integer.parseInt(line[1]);
        
        int div = num2 / 2;
        if(num2 % 2 == 1) {
            div++;
        }
        
        int num = Math.max(num1, div);
        
        // Who needs recursion?
        for(int i = 0; i < 21; i++) {
            for(int j = 0; j < 21; j++) {
                for(int k = 0; k < 5; k++) {
                    for(int l = 0; l < 21; l++) {
                        for(int m = 0; m < 5; m++) {                        
                            sb.append(cons[i]);
                            sb.append(cons[j]);
                            sb.append(vows[k]);
                            sb.append(cons[l]);
                            sb.append(vows[m]);
                            
                            num--;
                            
                            // Output
                            if(num == 0) {
                                System.out.print(sb);
                                System.exit(0);
                            }else {
                                sb.append(" ");
                            }
                        }
                    }
                }   
            }
        }
        
        br.close();
    }

}
