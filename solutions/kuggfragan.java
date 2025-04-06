import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class kuggfragan {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // Loop
        for (int i = 0; i < m; i++) {

            line = br.readLine().split(" ");
            int u = Integer.parseInt(line[0]);
            int v = Integer.parseInt(line[1]);

            graph[u].add(v);
            graph[v].add(u);
        }

        int[] color = new int[n];
        Arrays.fill(color, -1);

        // BFS!
        boolean isBipartite = true;
        for (int i = 0; i < n && isBipartite; i++) {

            if (color[i] == -1) {

                Queue<Integer> queue = new ArrayDeque<>();
                queue.add(i);
                color[i] = 0;

                while (!queue.isEmpty() && isBipartite) {
                    int current = queue.poll();
                    for (int neighbor : graph[current]) {
                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[current];
                            queue.add(neighbor);
                        } else if (color[neighbor] == color[current]) {
                            isBipartite = false;
                            break;
                        }
                    }
                }
            }
        }
        
        // Output
        if(isBipartite) {
            System.out.println("attend here");
        } else {
            System.out.println("no way");
        }

        br.close();
    }
}
