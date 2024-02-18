import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class supercomputer {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int bits = Integer.parseInt(line[0]);
        int num = Integer.parseInt(line[1]);
        
        BitSet sieve = new BitSet(bits);
        
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            char ch = line[0].charAt(0);
            
            // Flip a bit!
            if(ch == 'F') {
                
                int index = Integer.parseInt(line[1]);
                sieve.flip(index);
                
            // Query a range
            }else if(ch == 'C') {
                
                int from = Integer.parseInt(line[1]);
                int to = Integer.parseInt(line[2]);
                
                BitSet query = sieve.get(from, to + 1);
                sb.append(query.cardinality() + "\n");
            }
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
