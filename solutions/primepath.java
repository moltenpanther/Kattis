import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class primepath {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        HashSet<Integer> primes = getPrimes();

        // Loop
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            String from = line[0];
            String to = line[1];
            
            int result = findMinCostBFS(from, to, primes);
            if (result == -1) {
                sb.append("Impossible\n");
            } else {
                sb.append(result).append("\n");
            }

        }

        // Output
        System.out.println(sb);

        br.close();
    }

    public static HashSet<Integer> getPrimes() {
    
        int num = 10000;
        
        HashSet<Integer> primes = new HashSet<Integer>();
        
        BitSet sieve = new BitSet();
        sieve.set(0, true);
        
        primes.add(2);
        for (int i = 1; i <= 10000; i += 2) {
            if (!sieve.get((i - 1) / 2)) {
                primes.add(i);

                // Sets multiples of the prime as not prime
                for (int j = i * i; j <= num; j += 2 * i) {
                    sieve.set((j - 1) / 2, true);
                }
            }
        }

        return primes;
    }

    public static int findMinCostBFS(String from, String to, HashSet<Integer> primes) {
        
        Queue<String> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        
        queue.add(from);
        visited.add(from);
        
        // BFS!
        int cost = 0;
        while (!queue.isEmpty()) {

            int size = queue.size();
            
            for (int i = 0; i < size; i++) {

                String current = queue.poll();
                
                if (current.equals(to)) {
                    return cost;
                }
                
                for (int j = 0; j < 4; j++) {
                    char[] currentArr = current.toCharArray();
                    for (char digit = '0'; digit <= '9'; digit++) {

                        if (digit != currentArr[j]) {
                            
                            currentArr[j] = digit;
                            String newNum = new String(currentArr);
                            
                            int newNumInt = Integer.parseInt(newNum);
                            if (newNumInt >= 1000 && primes.contains(newNumInt) && !visited.contains(newNum)) {
                                visited.add(newNum);
                                queue.add(newNum);
                            }
                        }
                    }
                }
            }

            cost++;
        }

        return -1;
    }

}
