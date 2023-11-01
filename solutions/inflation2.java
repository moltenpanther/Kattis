import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class inflation2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        long total = 0;
        
        Hashtable<Long, Integer> hash = new Hashtable<Long, Integer>();
        
        long[] prices = new long[num];
        for(int i = 0; i < num; i++) {
            long price = Long.parseLong(line[i]);
            total += price;
            
            hash.putIfAbsent(price, 0);
            hash.replace(price, hash.get(price) + 1);
        }
        
        long mod = 0;
        
        int num2 = Integer.parseInt(br.readLine());
        for(int i = 0; i < num2; i++) {
            
            line = br.readLine().split(" ");
            
            // Inflation
            if(line[0].charAt(0) == 'I') {
                
                long up = Long.parseLong(line[1]);
                mod += up;
                total += num * up;
                
            // Set
            }else {
                
                long from = Long.parseLong(line[1]) - mod;
                long to = Long.parseLong(line[2]) - mod;
                
                long dif = to - from;
                
                if(hash.containsKey(from)) {
                    int count = hash.remove(from);          
                    if(hash.containsKey(to)) {
                        hash.replace(to, hash.get(to) + count);
                    }else {
                        hash.put(to, count);
                    }
                    total += dif * count;
                }
                
            }
            
            // Output
            System.out.println(total);          
        }
        
        
        br.close();
    }

}
