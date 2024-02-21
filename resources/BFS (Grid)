import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class conquestcampaign {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading input
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        int num = Integer.parseInt(line[2]);
        
        Queue<Square> queue = new LinkedList<Square>();
        Square[][] grid = new Square[rows][cols];
        
        for(int i = 0; i < num; i++) {
            line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]) - 1;
            int y = Integer.parseInt(line[1]) - 1;
            
            grid[x][y] = new Square(x, y, 1);
            queue.add(grid[x][y]);
        }
        
        // BFS!
        int ans = 1;
        while(!queue.isEmpty()) {
            
            Square square = queue.remove();
            int x = square.getX();
            int y = square.getY();
            int dis = square.getDis();
            
            if(ans < dis) {
                ans = dis;
            }
            
            // Up
            if(x - 1 >= 0) {
                if(grid[x - 1][y] == null) {
                    grid[x - 1][y] = new Square(x - 1, y, dis + 1);
                    queue.add(grid[x - 1][y]);
                }
            }
            // Down
            if(x + 1 < rows) {
                if(grid[x + 1][y] == null) {
                    grid[x + 1][y] = new Square(x + 1, y, dis + 1);
                    queue.add(grid[x + 1][y]);
                }
            }
            // Left
            if(y - 1 >= 0) {
                if(grid[x][y - 1] == null) {
                    grid[x][y - 1] = new Square(x, y - 1, dis + 1);
                    queue.add(grid[x][y - 1]);
                }
            }
            // Right
            if(y + 1 < cols) {
                if(grid[x][y + 1] == null) {
                    grid[x][y + 1] = new Square(x, y + 1, dis + 1);
                    queue.add(grid[x][y + 1]);
                }
            }
        }
        
        // Output
        System.out.println(ans);
        
        br.close();
    }

}

class Square {
    
    int x;
    int y;
    int dis = 0;
    
    public Square(int x, int y, int dis) {
        this.x = x;
        this.y = y;
        this.dis = dis;
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

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
