import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class namegeneration {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        char[] vows = {'a', 'e', 'i', 'o', 'u'};
        char[] cons = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        
        int num = Integer.parseInt(br.readLine());
        
        // Who needs recursion?
        for(int i = 0; i < 21; i++) {
            for(int j = 0; j < 21; j++) {
                for(int k = 0; k < 5; k++) {
                    for(int l = 0; l < 21; l++) {
                            
                        sb.append(cons[i]);
                        sb.append(cons[j]);
                        sb.append(vows[k]);
                        sb.append(cons[l]);
                        sb.append("\n");
                        
                        num--;
                        
                        // Output
                        if(num == 0) {
                            System.out.print(sb);
                            System.exit(0);
                        }
                    }   
                }   
            }
        }
        
        br.close();
    }

}
