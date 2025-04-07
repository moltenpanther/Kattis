import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class dfaisempty {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int s = Integer.parseInt(line[2]);
        int f = Integer.parseInt(line[3]);

        // Because we don't need the alphabet
        br.readLine();

        Set<Integer> finals = new HashSet<>();

        String finalsLine = br.readLine();
        if (finalsLine != null && !finalsLine.isEmpty()) {
            String[] finalStates = finalsLine.split(" ");
            for (String fs : finalStates) {
                finals.add(Integer.parseInt(fs));
            }
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
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        boolean empty = true;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (finals.contains(curr)) {
                empty = false;
                break;
            }
            for (int next : transitions.get(curr)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

        // Output
        if(!empty) {
            System.out.print("non-");
        }
        System.out.println("empty");
                    
        br.close();
    }

}
