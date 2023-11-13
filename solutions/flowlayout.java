import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flowlayout {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        while(num != 0) {
            
            String[] line = br.readLine().split(" ");
            int width = Integer.parseInt(line[0]);
            int height = Integer.parseInt(line[1]);
            
            int maxW = 0;
            int sumW = 0;
            
            int sumH = 0;
            int rowMaxH = 0;
            
            while(width > 0) {
                
                if(sumW + width <= num) {
                    
                    // Width
                    sumW += width;
                    
                    // Height
                    if(height > rowMaxH) {
                        rowMaxH = height;
                    }
                    
                }else {
                    
                    // Width
                    if(sumW > maxW) {
                        maxW = sumW;                
                    }
                    sumW = width;
                    
                    // Height
                    sumH += rowMaxH;
                    rowMaxH = height;
                    
                }

                line = br.readLine().split(" ");
                width = Integer.parseInt(line[0]);
                height = Integer.parseInt(line[1]);
            }
            
            if(sumW > maxW) {
                maxW = sumW;                        
            }
            sumH += rowMaxH;
            
            // Output
            System.out.println(maxW + " x " + sumH);
            
            num = Integer.parseInt(br.readLine());
        }
        
        br.close();
    }

}
