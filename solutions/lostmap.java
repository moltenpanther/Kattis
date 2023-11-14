import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class lostmap {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[num];
        HashMap<Integer, LinkedList<Edge>> hash = new HashMap<Integer, LinkedList<Edge>>();

        // Creating all the LinkedLists
        for(int i = 0; i < num; i++) {
            LinkedList<Edge> list = new LinkedList<Edge>();
            hash.put(i, list);          
        }

        // Make weighted edges from the adjacency matrix
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            for(int j = i + 1; j < num; j++) {
                
                int weight = Integer.parseInt(line[j]);
                
                Edge edge = new Edge(weight, i, j);
                hash.get(i).add(edge);
                
                edge = new Edge(weight, j, i);
                hash.get(j).add(edge);
            }
        }
        
        
        Comparator<Edge> comp = Comparator.comparing(Edge::getWeight);
        PriorityQueue<Edge> queue = new PriorityQueue<Edge>(comp);
        
        queue.addAll(hash.get(0));
        visited[0] = true;
        
        // Making a minimum spanning tree
        int count = 0;
        while(count < num - 1 && !queue.isEmpty()) {
            
            Edge edge = queue.remove();
            
            if(!visited[edge.to]) {             
                visited[edge.to] = true;
                
                queue.addAll(hash.get(edge.to));
                
                // Output
                System.out.println(edge);
                count++;
            }
        }

        br.close();
    }

}

class Edge implements Comparable<Edge>{
    
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
        return (from + 1) + " " + (to + 1);
    }

    @Override
    public int compareTo(Edge o) {
        return Integer.compare(this.weight, o.weight);
    }
    
}
