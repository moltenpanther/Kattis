import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class textencryption {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = 0;
        while((num = Integer.parseInt(br.readLine())) != 0) {
            
            String line = br.readLine().toUpperCase().replaceAll(" ", "");
            int len = line.length();
                        
            char[] ans = new char[line.length()];
            
            int start = 0;
            int index = 0;
            
            for(int i = 0; i < len; i++) {
                
                char ch = line.charAt(i);
                
                ans[index] = ch;
                
                index += num;
                if(index >= len) {
                    index = ++start;
                }
            }
            
            sb.append(ans);
            sb.append("\n");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}

