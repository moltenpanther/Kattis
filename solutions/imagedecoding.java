import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class imagedecoding {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();     

        String[] inp = br.readLine().split(" ");
        int rows = Integer.parseInt(inp[0]);
        
        while(rows != 0) {
            
            // Drawing the image
            int goal = 0;
            boolean error = false;
            for(int i = 0; i < rows; i++) {
                
                inp = br.readLine().split(" ");
                
                boolean dot = true;
                if(inp[0].charAt(0) == '#') {
                    dot = false;
                }
                
                int sum = 0;
                for(int j = 1; j < inp.length; j++) {
                    
                    int num = Integer.parseInt(inp[j]);
                    sum += num;
                    
                    char ch = '#';
                    if(dot) {
                        ch = '.';
                    }
                    
                    for(int k = 0; k < num; k++) {
                        sb.append(ch);
                    }
                    
                    dot = !dot;
                }
                
                sb.append("\n");
                
                if(i == 0) {
                    goal = sum;
                }else {
                    if(sum != goal) {
                        error = true;
                    }
                }
                
            }
                    
            inp = br.readLine().split(" ");
            rows = Integer.parseInt(inp[0]);
            
            if(error) {
                sb.append("Error decoding image\n");
            }
            sb.append("\n");
        }
        
        // Output           
        System.out.println(sb.substring(0, sb.length() - 2));
        
        br.close();
    }

}

