import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class busnumbers2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Preparing a grid of possible sums
        HashSet<Integer> bus = getSums();
        
        int num = Integer.parseInt(br.readLine());
        
        // Iterating backwards
        boolean found = false;
        while(!found && num > 0) {
            
            if(bus.contains(num)) {
                found = true;
            }else {
                num--;
            }
        }
        
        // Output
        if(found) {
            System.out.println(num);
        }else {
            System.out.println("none");
        }
        
        br.close();
    }

    private static HashSet<Integer> getSums() {
        
        HashSet<Integer> hash = new HashSet<Integer>();
        HashSet<Integer> bus = new HashSet<Integer>();
        
        for(int i = 1; i <= 58; i++) {
            
            int cube1 = i * i * i;
            
            for(int j = i; j <= 73; j++) {
                
                int cube2 = j * j * j;
                int sum = cube1 + cube2;
                
                if(sum <= 400000) {
                    if(hash.contains(sum)) {
                        bus.add(sum);
                    }
                    hash.add(sum);
                }else {
                    j = 74;
                }
            }
        }
        
        return bus;
    }

}
