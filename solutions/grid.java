import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class grid {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        
        // Filling the grid
        Node[][] grid = new Node[rows][cols];
        for(int i = 0; i < rows; i++) {
            String inp = br.readLine();
            for(int j = 0; j < cols; j++) {
                int steps = Integer.parseInt(inp.charAt(j) + "");
                Node node = new Node(steps, i, j);
                grid[i][j] = node;
            }
        }
        
        // BFS!
        Queue<Node> queue = new LinkedList<Node>();
        grid[0][0].setDis(0);
        queue.add(grid[0][0]);
        
        int dis = 0;
        boolean goal = false;
        while(!queue.isEmpty() && !goal) {
            
            Node node = queue.remove();
            
            int row = node.row;
            int col = node.col;
            int steps = node.steps;
            dis = node.dis;
            
            if(row == rows - 1 && col == cols - 1) {
                goal = true;
            }else {
                // Add adjacent
                // Up
                if(row - steps >= 0) {
                    if(!grid[row - steps][col].isVisited()) {
                        grid[row - steps][col].setDis(dis + 1);
                        queue.add(grid[row - steps][col]);
                    }
                }
                // Down
                if(row + steps < rows) {
                    if(!grid[row + steps][col].isVisited()) {
                        grid[row + steps][col].setDis(dis + 1);
                        queue.add(grid[row + steps][col]);
                    }
                }
                // Left
                if(col - steps >= 0) {
                    if(!grid[row][col - steps].isVisited()) {
                        grid[row][col - steps].setDis(dis + 1);
                        queue.add(grid[row][col - steps]);
                    }
                }
                // Right
                if(col + steps < cols) {
                    if(!grid[row][col + steps].isVisited()) {
                        grid[row][col + steps].setDis(dis + 1);
                        queue.add(grid[row][col + steps]);
                    }
                }
            }
        }
        
        // Output
        if(goal) {
            System.out.println(dis);
        }else {
            System.out.println(-1);
        }
        
        br.close();
    }

}

class Node {
    
    int steps;
    int row;
    int col;
    int dis;
    boolean visited = false;
    
    public Node(int steps, int row, int col) {
        this.steps = steps;
        this.row = row;
        this.col = col;
        dis = 0;
    }
    
    public int getSteps() {
        return steps;
    }
    
    public int getRow() {
        return row;
    }
    
    public int getCol() {
        return col;
    }
    
    public void setSteps(int steps) {
        this.steps = steps;
    }
    
    public void setRow(int row) {
        this.row = row;
    }
    
    public void setCol(int col) {
        this.col = col;
    }

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
        this.visited = true;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
}
