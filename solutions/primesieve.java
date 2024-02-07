import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class primesieve {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int test = Integer.parseInt(line[0]);
        int num = Integer.parseInt(line[1]);
        
        int sqrt = (int) Math.sqrt(test);
        int size = (test + 1) / 2;
        BitSet sieve = new BitSet(size);
        sieve.set(0, true);
        
        for(int i = 1; i <= sqrt; i += 2) {
            if(!sieve.get((i - 1) / 2)) {   
                for(int j = 0; j <= test; j += 2) {
                    int index = (i * i) + (j * i);
                    if(index < test) {
                        sieve.set((index - 1) / 2, true);
                    }else {
                        j = test;
                    }
                }
            }
        }
        
        int count = 1;
        for(int i = 0; i < size; i++) {
            if(!sieve.get(i)) {
                count++;
            }
        }
        
    //  count = sieve.cardinality();
        System.out.println();
        
        // Output
        StringBuilder sb = new StringBuilder();
        sb.append(count + "\n");
        
        for(int i = 0; i < num; i++) {
            
            int check = Integer.parseInt(br.readLine());
            boolean even = check % 2 == 0 && check > 2;
            
            if(!sieve.get((check - 1) / 2) && !even || check == 2) {
                sb.append(1 + "\n");
            }else {
                sb.append(0 + "\n");
            }   
        }
        
        System.out.println(sb);
        
        br.close();
    }

}
