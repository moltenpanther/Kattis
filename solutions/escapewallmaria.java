import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class escapewallmaria {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading input
        String[] line = br.readLine().split(" ");
        int time = Integer.parseInt(line[0]);
        int rows = Integer.parseInt(line[1]);
        int cols = Integer.parseInt(line[2]);
        
        Queue<Square> queue = new LinkedList<Square>();
        Square[][] grid = new Square[rows][cols];
        
        for(int i = 0; i < rows; i++) {
            
            String row = br.readLine();
            for(int j = 0; j < cols; j++) {
                
                char ch = row.charAt(j);
                Square sq = new Square(ch, i, j);
                if(i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
                    sq.setEdge(true);
                }
                if(ch == 'S') {
                    sq.visited = true;
                    queue.add(sq);
                }
                
                grid[i][j] = sq;
            }
        }
        
        // BFS!
        boolean free = false;
        int ans = -1;
        while(!queue.isEmpty() && !free) {
            
            Square square = queue.remove();
            int x = square.getX();
            int y = square.getY();
            int dis = square.getDis();
            
            if(square.isEdge()) {
                ans = dis;
                free = true;
            }else {
                // Up
                if(x - 1 >= 0) {
                    Square next = grid[x - 1][y];
                    if(!next.visited) {
                        char nextVal = next.getVal();
                        if(nextVal == '0' || nextVal == 'D') {
                            next.setVisited(true);
                            next.setDis(dis + 1);
                            queue.add(next);
                        }
                    
                    }
                }
                // Down
                if(x + 1 < rows) {
                    Square next = grid[x + 1][y];
                    if(!next.visited) {
                        char nextVal = next.getVal();
                        if(nextVal == '0' || nextVal == 'U') {
                            next.setVisited(true);
                            next.setDis(dis + 1);
                            queue.add(next);
                        }
                    
                    }
                }
                // Left
                if(y - 1 >= 0) {
                    Square next = grid[x][y - 1];
                    if(!next.visited) {
                        char nextVal = next.getVal();
                        if(nextVal == '0' || nextVal == 'R') {
                            next.setVisited(true);
                            next.setDis(dis + 1);
                            queue.add(next);
                        }
                    
                    }
                }
                // Right
                if(y + 1 < cols) {
                    Square next = grid[x][y + 1];
                    if(!next.visited) {
                        char nextVal = next.getVal();
                        if(nextVal == '0' || nextVal == 'L') {
                            next.setVisited(true);
                            next.setDis(dis + 1);
                            queue.add(next);
                        }
                    
                    }
                }
            }
        }
        
        if(ans > time) {
            free = false;
        }

        // Output
        if(free) {
            System.out.println(ans);            
        }else {
            System.out.println("NOT POSSIBLE");
        }
        
        br.close();
    }

}

class Square {
    
    char val;
    int x;
    int y;
    int dis = 0;
    boolean edge = false;
    boolean visited = false;
    
    public Square(char val, int x, int y) {
        this.val = val;
        this.x = x;
        this.y = y;
        this.dis = 0;
    }
    
    public int getDis() {
        return dis;
    }
    
    public void setDis(int dis) {
        this.dis = dis;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    public char getVal() {
        return val;
    }

    public void setVal(char val) {
        this.val = val;
    }

    public boolean isEdge() {
        return edge;
    }

    public void setEdge(boolean edge) {
        this.edge = edge;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ") - " + val + " -> " + dis;
    }

}
