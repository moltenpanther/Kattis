import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class dominoes2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int cases = Integer.parseInt(br.readLine());
        for(int i = 0; i < cases; i++) {
            
            HashMap<Integer, Domino> hash = new HashMap<Integer, Domino>();
            
            String[] line = br.readLine().split(" ");
            int num = Integer.parseInt(line[0]);
            int adjacencies = Integer.parseInt(line[1]);
            int knockedOver = Integer.parseInt(line[2]);
            
            // Adding in all Dominos
            for(int j = 1; j <= num; j++) {
                hash.put(j, new Domino(j));
            }
            
            // Setting up adjacencies
            for(int j = 0; j < adjacencies; j++) {
                
                line = br.readLine().split(" ");
                int from = Integer.parseInt(line[0]);
                int to = Integer.parseInt(line[1]);
                
                hash.get(from).addAdj(to);
            }
            
            // Knocking over Dominos with BFS
            int count = 0;
            for(int j = 0; j < knockedOver; j++) {
                
                int start = Integer.parseInt(br.readLine());
                Domino domino = hash.get(start);
                
                Deque<Domino> queue = new LinkedList<Domino>();
                if(!domino.isVisited()) {
                    domino.setVisited(true);
                    queue.add(domino);
                }
                
                while(!queue.isEmpty()) {
                    
                    domino = queue.remove();
                    count++;
                    
                    HashSet<Integer> adj = domino.getAdj();
                    for(Integer next : adj) {
                        if(!hash.get(next).isVisited()) {
                            hash.get(next).setVisited(true);
                            queue.add(hash.get(next));
                        }
                    }
                }
            }
            
            sb.append(count);
            sb.append("\n");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}

class Domino {
    
    int num;
    HashSet<Integer> adj = new HashSet<Integer>();;
    boolean visited = false;
    
    public Domino(int num) {
        this.num = num;
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public HashSet<Integer> getAdj() {
        return adj;
    }
    
    public void addAdj(int num) {
        this.adj.add(num);
    }
    
    public void setAdj(HashSet<Integer> adj) {
        this.adj = adj;
    }
    
    public boolean isVisited() {
        return visited;
    }
    
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    @Override
    public String toString() {
        return num + ": " + adj.size() + " -- " + visited;
    }
    
    
}
