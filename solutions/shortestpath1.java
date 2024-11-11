import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class shortestpath1 {

    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("0 0 0 0")) {
           
            String[] parts = line.split(" ");
            
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int q = Integer.parseInt(parts[2]);
            int s = Integer.parseInt(parts[3]);

            Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node(i);
            }

            for (int i = 0; i < m; i++) {
               
                parts = br.readLine().split(" ");
                
                int u = Integer.parseInt(parts[0]);
                int v = Integer.parseInt(parts[1]);
                int w = Integer.parseInt(parts[2]);
                
                nodes[u].addEdge(new Edge(v, w));
            }

            dijkstra(nodes, s);

            for (int i = 0; i < q; i++) {
                int query = Integer.parseInt(br.readLine());
                int distance = nodes[query].distance;
                System.out.println(distance == Integer.MAX_VALUE ? "Impossible" : distance);
            }

            System.out.println();
        }

        br.close();
    }

    private static void dijkstra(Node[] nodes, int start) {
       
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        nodes[start].distance = 0;
        queue.add(nodes[start]);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (Edge edge : current.edges) {
               
                Node neighbor = nodes[edge.to];
                int newDistance = current.distance + edge.weight;
               
                if (newDistance < neighbor.distance) {
                    neighbor.distance = newDistance;
                    queue.add(neighbor);
                }
            }
        }
    }
    
    static class Node {
        int id;
        int distance = Integer.MAX_VALUE;
        List<Edge> edges = new ArrayList<>();

        public Node(int id) {
            this.id = id;
        }

        public void addEdge(Edge edge) {
            edges.add(edge);
        }
    }

    static class Edge {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    
}
