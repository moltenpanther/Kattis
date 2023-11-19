import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class bryr {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int nodes = Integer.parseInt(line[0]);
        int edges = Integer.parseInt(line[1]);
        
        // Making the Nodes
        HashMap<Integer, Node> hash = new HashMap<Integer, Node>();
        for(int i = 1; i <= nodes; i++) {
            Node node = new Node(i);
            hash.put(i, node);
        }
        
        // Loading the Edges
        for(int i = 0; i < edges; i++) {
            
            line = br.readLine().split(" ");
            int from = Integer.parseInt(line[0]);
            int to = Integer.parseInt(line[1]);
            int weight = Integer.parseInt(line[2]);
            
            Node node = hash.get(from);
            Edge edge = new Edge(weight, from, to);
            node.adj.add(edge);
            
            node = hash.get(to);            
            edge = new Edge(weight, to, from);          
            node.adj.add(edge);
        }
        
        // Dijkstra's!
        Comparator<Node> comp = Comparator.comparing(Node::getDis);
        PriorityQueue<Node> queue = new PriorityQueue<Node>(comp);
        
        hash.get(1).dis = 0;
        queue.addAll(hash.values());
        
        while(!queue.isEmpty()) {
            
            Node node = queue.remove();
            
            LinkedList<Edge> list = node.adj;
            
            for(Edge edge : list) {
                
                Node next = hash.get(edge.to);
                
                int newDis = node.dis + edge.weight;
                if(next.dis > newDis) {
                    next.dis = newDis;
                    next.prev = node;

                    hash.put(edge.to, next);
                    queue.remove(next);
                    queue.add(next);
                }
                
                
            }
        }

        // Output
        int end = hash.get(nodes).dis;
        System.out.println(end);
        
        br.close();
    }

}

class Node implements Comparable<Node> {
    
    int num = 0;
    int dis = Integer.MAX_VALUE;
    Node prev = null;
    LinkedList<Edge> adj = new LinkedList<Edge>();
    
    public Node(int num) {
        this.num = num;
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public int getDis() {
        return dis;
    }
    
    public void setDis(int dis) {
        this.dis = dis;
    }
    
    public Node getPrev() {
        return prev;
    }
    
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
    public LinkedList<Edge> getAdj() {
        return adj;
    }
    
    public void setAdj(LinkedList<Edge> adj) {
        this.adj = adj;
    }

    @Override
    public String toString() {
        return "Node -- [num=" + num + ", dis=" + dis + "]";
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.dis, o.dis);
    }
    
}


class Edge {
    
    int weight;
    int from;
    int to;
    
    public Edge(int weight, int from, int to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Edge [weight=" + weight + ", from=" + from + ", to=" + to + "]";
    }
    
}
