import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class cd {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int jack = Integer.parseInt(line[0]);
        int jill = Integer.parseInt(line[1]);
        
        while(jack + jill > 0) {
            
            HashSet<Integer> hash = new HashSet<Integer>();
            
            // Jack
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < jack; i++) {
                
                int num = Integer.parseInt(br.readLine());
                hash.add(num);
                
                if(i == jack - 1) {
                    max = num;
                }
            }
            
            // Jill
            int count = 0;
            for(int i = 0; i < jill; i++) {
                int num = Integer.parseInt(br.readLine());
                if(hash.contains(num)) {
                    count++;
                }
            }
            
            // Output
            System.out.println(count);
            
            line = br.readLine().split(" ");
            jack = Integer.parseInt(line[0]);
            jill = Integer.parseInt(line[1]);
        }       
        
        br.close();
    }

}
