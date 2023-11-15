import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class millionairemadness {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        
        // Filling the grid with Piles
        Pile[][] grid = new Pile[rows][cols];
        for(int i = 0; i < rows; i++) {
            
            line = br.readLine().split(" ");        
            for(int j = 0; j < cols; j++) {
                int num = Integer.parseInt(line[j]);
                grid[i][j] = new Pile(num, i, j);
            }
        }
        
        // Building the edges
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                
                Pile pile = grid[i][j];
                
                // Up
                if(i - 1 >= 0) {
                    Pile neighbor = grid[i - 1][j];
                    int dif = neighbor.num - pile.num;
                    if(dif < 0) {
                        dif = 0;
                    }
                    
                    Edge edge = new Edge(dif, i, j, i - 1, j);
                    pile.list.add(edge);
                }
                
                // Down
                if(i + 1 < rows) {
                    Pile neighbor = grid[i + 1][j];
                    int dif = neighbor.num - pile.num;
                    if(dif < 0) {
                        dif = 0;
                    }
                    
                    Edge edge = new Edge(dif, i, j, i + 1, j);
                    pile.list.add(edge);
                }
                
                // Left
                if(j - 1 >= 0) {
                    Pile neighbor = grid[i][j - 1];
                    int dif = neighbor.num - pile.num;
                    if(dif < 0) {
                        dif = 0;
                    }
                    
                    Edge edge = new Edge(dif, i, j, i, j - 1);
                    pile.list.add(edge);
                }
                
                // Right
                if(j + 1 < cols) {
                    Pile neighbor = grid[i][j + 1];
                    int dif = neighbor.num - pile.num;
                    if(dif < 0) {
                        dif = 0;
                    }
                    
                    Edge edge = new Edge(dif, i, j, i, j + 1);
                    pile.list.add(edge);
                }
                
            }
        }
                
        Pile pile = grid[0][0];
        pile.visited = true;

        // Searching the grid
        Comparator<Edge> comp = Comparator.comparing(Edge::getWeight);
        PriorityQueue<Edge> queue = new PriorityQueue<Edge>(comp);
        queue.addAll(pile.getList());
        
        int max = 0;
        while(!queue.isEmpty()) {
                        
            Edge edge = queue.remove();                     
            if(edge.weight > max) {
                max = edge.weight;
            }
            
            if(edge.toX == (rows - 1) && edge.toY == (cols - 1)) {
                break;
            }

            pile = grid[edge.toX][edge.toY];
            if(!pile.visited) {
                pile.visited = true;
                queue.addAll(pile.getList());
            }
            
        }
        
        // Output
        System.out.println(max);
        
        br.close();
    }

}

class Pile {
    

    int num = 0;
    int row = 0;
    int col = 0;
    
    LinkedList<Edge> list;
    boolean visited = false;
    
    public Pile(int num, int row, int col){
        this.num = num;
        this.row = row;
        this.col = col;
        this.list = new LinkedList<Edge>();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public LinkedList<Edge> getList() {
        return list;
    }

    public void setList(LinkedList<Edge> list) {
        this.list = list;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Pile [num=" + num + ", row=" + row + ", col=" + col + "]";
    }

}

class Edge implements Comparable<Edge>{
    
    int weight;
    
    int fromX;
    int fromY;
    
    int toX;
    int toY;
    
    public Edge(int weight, int fromX, int fromY, int toX, int toY) {
        this.weight = weight;
        this.fromX = fromX;
        this.fromY = fromY;
        this.toX = toX;
        this.toY = toY;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFromX() {
        return fromX;
    }

    public void setFromX(int fromX) {
        this.fromX = fromX;
    }

    public int getFromY() {
        return fromY;
    }

    public void setFromY(int fromY) {
        this.fromY = fromY;
    }

    public int getToX() {
        return toX;
    }

    public void setToX(int toX) {
        this.toX = toX;
    }

    public int getToY() {
        return toY;
    }

    public void setToY(int toY) {
        this.toY = toY;
    }

    @Override
    public int compareTo(Edge o) {
        return Integer.compare(this.weight, o.weight);
    }

    @Override
    public String toString() {
        return "Edge [weight=" + weight + ", fromX=" + fromX + ", fromY=" + fromY + ", toX=" + toX + ", toY=" + toY
                + "]";
    }
    
}
