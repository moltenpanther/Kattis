import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cursethedarkness {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            double bookX = Double.parseDouble(line[0]);
            double bookY = Double.parseDouble(line[1]);
            
            int candles = Integer.parseInt(br.readLine());
            boolean light = false;
            for(int j = 0; j < candles; j++) {
                
                line = br.readLine().split(" ");
                double x = Double.parseDouble(line[0]);
                double y = Double.parseDouble(line[1]);
                
                double dis = Math.sqrt(Math.pow(bookX - x,  2) + Math.pow(bookY - y, 2));
            
                if(dis <= 8) {
                    light = true;
                }
            }
            
            if(light) {
                sb.append("light a candle\n");
            }else {
                sb.append("curse the darkness\n");
            }
            
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
