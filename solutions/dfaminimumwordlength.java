import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class dfaminimumwordlength {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int c = Integer.parseInt(line[1]);
        int s = Integer.parseInt(line[2]);
        int f = Integer.parseInt(line[3]);

        // Because we don't need the alphabet
        br.readLine();

        boolean done = false;
        int ans = -1;

        Set<Integer> finals = new HashSet<>();
        if (f == 0) {
            System.out.println(0);
            done = true;
        }

        if(!done) {

            String[] finalStates = br.readLine().split(" ");
            for (String fs : finalStates) {
                finals.add(Integer.parseInt(fs));
            }
            
            List<List<Integer>> transitions = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                transitions.add(new ArrayList<>());
            }

            for (int i = 1; i <= n; i++) {
                line = br.readLine().split(" ");
                for (String dest : line) {
                    transitions.get(i).add(Integer.parseInt(dest));
                }
            }
            
            // BFS!
            int[] dist = new int[n + 1];
            Arrays.fill(dist, -1);

            Queue<Integer> queue = new LinkedList<>(); 
            dist[s] = 0;
            queue.add(s);
            
            while (!queue.isEmpty()) {

                int curr = queue.poll();
                if (finals.contains(curr)) {
                    ans = dist[curr];
                    done = true;
                    break;
                }
                
                for (int next : transitions.get(curr)) {
                    if (dist[next] == -1) {
                        dist[next] = dist[curr] + 1;
                        queue.add(next);
                    }
                }
            }
            
        }
        
        // Output
        System.out.println(ans);
            
        br.close();
    }

}
