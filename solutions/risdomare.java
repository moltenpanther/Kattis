import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class risdomare {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String line = br.readLine();
        
        int index = 0;
        int max = -1;
        int sum = 0;
        for(int i = 0; i < num; i++) {
            
            String[] inp = br.readLine().split(" ");
            int grains = Integer.parseInt(inp[0]);
            int size = Integer.parseInt(inp[1]);
                        
            if(grains + size >= sum) {
                
                if(grains + size > sum) {
                    max = -1;
                }
                
                sum = grains + size;

                if(line.charAt(0) == 's') {
                    if(size >= max) {
                        max = size;
                        index = i;
                    }
                }else {
                    if(grains >= max) {
                        max = grains;
                        index = i;
                    }
                }
            }
        }
                
        // Output
        System.out.println(index + 1);
                
        br.close();
    }

}

