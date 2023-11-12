import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class locustlocus {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            int year = Integer.parseInt(line[0]);
            int loc1 = Integer.parseInt(line[1]);
            int loc2 = Integer.parseInt(line[2]);
            
            int total = loc1;
            while(total % loc2 != 0) {
                total += loc1;
            }
            
            int newYear = year + total;
            if(newYear < min) {
                min = newYear;
            }
        }
        
        // Output
        System.out.println(min);
        
        br.close();
    }

}
