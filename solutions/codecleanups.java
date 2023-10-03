import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codecleanups {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        int sum = 0;
        int days = 0;
        int count = 1;

        int prevDay = Integer.parseInt(line[0]);
        days++;
        
        for(int i = 1; i < num; i++) {  
            
            int presDay = Integer.parseInt(line[i]);

            int dif = presDay - prevDay;
            sum += dif * days;
                        
            if(sum >= 20) {             
                sum = 0;
                days = 0;
                count++;
            }
            
            prevDay = presDay;
            days++;
                        
        }        
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
