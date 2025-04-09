import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class hittast {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        int[] lodging = new int[n + 1];
        line = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            lodging[i] = Integer.parseInt(line[i - 1]);
        }

        List<List<Edge>> graphAlfur = new ArrayList<>();
        List<List<Edge>> graphBenedikt = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graphAlfur.add(new ArrayList<>());
            graphBenedikt.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            line = br.readLine().split(" ");
            int u = Integer.parseInt(line[0]);
            int v = Integer.parseInt(line[1]);
            int costA = Integer.parseInt(line[2]);
            int costB = Integer.parseInt(line[3]);

            graphAlfur.get(u).add(new Edge(v, costA));
            graphAlfur.get(v).add(new Edge(u, costA));
            graphBenedikt.get(u).add(new Edge(v, costB));
            graphBenedikt.get(v).add(new Edge(u, costB));
        }

        long[] distAlfur = dijkstra(graphAlfur, 1, n);
        long[] distBenedikt = dijkstra(graphBenedikt, n, n);

        long minCost = Long.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            minCost = Math.min(minCost, distAlfur[i] + distBenedikt[i] + lodging[i]);
        }

        sb.append(minCost);

        // Output
        System.out.println(sb);
        br.close();
    }

    // Dijksta's!
    public static long[] dijkstra(List<List<Edge>> graph, int start, int n) {

        long[] dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingLong(e -> e.cost));
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {

            Edge current = pq.poll();
            if (current.cost > dist[current.to]) continue;

            for (Edge next : graph.get(current.to)) {
                if (dist[next.to] > dist[current.to] + next.cost) {
                    dist[next.to] = dist[current.to] + next.cost;
                    pq.add(new Edge(next.to, (int) dist[next.to]));
                }
            }
        }

        return dist;
    }
}

class Edge {

    int to;
    int cost;

    Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

}
