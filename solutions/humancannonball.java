import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class humancannonball {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Cannon> queue = new PriorityQueue<>();

        String[] inp = br.readLine().split(" ");
        double startX = Double.parseDouble(inp[0]);
        double startY = Double.parseDouble(inp[1]);

        inp = br.readLine().split(" ");
        double endX = Double.parseDouble(inp[0]);
        double endY = Double.parseDouble(inp[1]);

        int num = Integer.parseInt(br.readLine());

        Cannon start = new Cannon(0, startX, startY);
        Cannon[] cannons = new Cannon[num + 2];
        Cannon end = new Cannon(num + 1, endX, endY);

        cannons[0] = start;
        cannons[num + 1] = end;

        // Loads cannons
        for (int i = 1; i <= num; i++) {

            inp = br.readLine().split(" ");

            Cannon cannon = new Cannon(i, Double.parseDouble(inp[0]), Double.parseDouble(inp[1]));
            cannons[i] = cannon;
        }

        // Builds edges
        for (int i = 0; i < num + 2; i++) {

            Cannon from = cannons[i];
            for (int j = 0; j < num + 2; j++) {

                if (i == j) {
                    continue;
                }

                Cannon to = cannons[j];
                double dist = getDist(from.x, from.y, to.x, to.y);
                double time;

                if (i == 0) {
                    time = dist / 5.0;
                } else {
                    double cannonTime = 2 + Math.abs(dist - 50) / 5.0;
                    double runTime = dist / 5.0;
                    time = Math.min(cannonTime, runTime);
                }

                Edge edge = new Edge(time, from.num, to.num);
                from.addDist(edge);
            }
        }

        start.distance = 0;
        queue.add(start);
        
        // Dijkstra's!
        while (!queue.isEmpty()) {

            Cannon cannonFrom = queue.poll();

            if (cannonFrom.visited) {
                continue;
            }
            cannonFrom.visited = true;

            LinkedList<Edge> edges = cannonFrom.getDist();
            for (Edge edg : edges) {

                int to = edg.to;
                Cannon next = cannons[to];

                if (cannonFrom.distance + edg.dis < next.distance) {
                    next.setDistance(cannonFrom.distance + edg.dis);
                    next.setPrev(cannonFrom);
                    queue.add(next);
                }
            }
        }

        Cannon cannon = cannons[cannons.length - 1];
        System.out.printf("%.6f\n", cannon.distance);

        br.close();
    }

    public static double getDist(double x1, double y1, double x2, double y2) {
        return Math.hypot(x1 - x2, y1 - y2);
    }
}

class Cannon implements Comparable<Cannon> {

    int num = 0;
    double x = 0;
    double y = 0;
    boolean visited = false;

    LinkedList<Edge> dist = new LinkedList<>();
    Cannon prev = null;
    double distance = Double.MAX_VALUE;

    public Cannon() {
        
    }

    public Cannon(int num, double x, double y) {
        this.num = num;
        this.x = x;
        this.y = y;
    }

    public void addDist(Edge edge) {
        dist.add(edge);
    }

    public LinkedList<Edge> getDist() {
        return dist;
    }

    public void setPrev(Cannon prev) {
        this.prev = prev;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(Cannon cannon) {
        return Double.compare(this.distance, cannon.distance);
    }

    @Override
    public String toString() {
        return num + ": " + x + " " + y + " - " + distance;
    }
}

class Edge {

    double dis;
    int from;
    int to;

    public Edge(double dis, int from, int to) {
        this.dis = dis;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Edge [dis=" + dis + ", from=" + from + ", to=" + to + "]";
    }
}
