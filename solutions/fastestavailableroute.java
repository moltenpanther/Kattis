import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class fastestavailableroute {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        String scale = line[2];
        
        Node start = null;
        Node end = null;
        
        // Building Grid
        Node[][] grid = new Node[rows][cols];
        for(int i = 0; i < rows; i++) {
            String in = br.readLine();
            for(int j = 0; j < cols; j++) {
                char val = in.charAt(j);
                grid[i][j] = new Node(val, i, j);
                
                if(val == '@') {
                    start = grid[i][j];
                }else if(val == '$') {
                    end = grid[i][j];
                }
            }
        }
        
        // BFS
        Queue<Node> queue = new LinkedList<Node>();
        start.setDis(0);
        queue.add(start);
        
        int finalDis = 0;
        boolean done = false;
        while(!queue.isEmpty() || !done) {
            
            Node node = queue.remove();
            char val = node.getVal();
            int row = node.getRow();
            int col = node.getCol();
            int dis = node.getDis();
            
            if(val == '$') {
                done = true;
                finalDis = dis;
            }else {
                
                // Up
                if(row  > 0) {
                    if(!grid[row - 1][col].isVisited()) {
                        grid[row - 1][col].setVisited(true);
                        grid[row - 1][col].setDis(dis + 1);
                        Node next = grid[row - 1][col];
                        queue.add(next);
                    }
                }
                // Down
                if(row < rows - 1) {
                    if(!grid[row + 1][col].isVisited()) {
                        grid[row + 1][col].setVisited(true);
                        grid[row + 1][col].setDis(dis + 1);
                        Node next = grid[row + 1][col];
                        queue.add(next);
                    }
                }
                // Left
                if(col > 0) {
                    if(!grid[row][col - 1].isVisited()) {
                        grid[row][col - 1].setVisited(true);
                        grid[row][col - 1].setDis(dis + 1);
                        Node next = grid[row][col - 1];
                        queue.add(next);
                    }
                }
                // Right
                if(col < cols - 1) {
                    if(!grid[row][col + 1].isVisited()) {
                        grid[row][col + 1].setVisited(true);
                        grid[row][col + 1].setDis(dis + 1);
                        Node next = grid[row][col + 1];
                        queue.add(next);
                    }
                }
            }
        }
        
        // Output
        String ans = finalDis + scale.substring(1);
        System.out.println("Your destination will arrive in " + ans + " meters");
        
        br.close();
    }

}

class Node {
    
    char val;
    int row;
    int col;
    int dis;
    boolean visited = true;
    
    public Node(char val, int row, int col) {
        this.val = val;
        this.row = row;
        this.col = col;
        
        if(val == '$' || val == '@' || val == '.') {
            visited = false;
        }
    }

    public char getVal() {
        return val;
    }
    
    public void setVal(char val) {
        this.val = val;
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

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Node [val=" + val + ", row=" + row + ", col=" + col + "]";
    }

}
