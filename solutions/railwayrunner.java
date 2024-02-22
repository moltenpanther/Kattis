import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class railwayrunner {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading input
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = 3;
        
        Queue<Square> queue = new LinkedList<Square>();
        Square[][] grid = new Square[rows][cols];
        
        for(int i = 0; i < rows; i++) {
            
            String row = br.readLine();
            for(int j = 0; j < cols; j++) {
                char ch = row.charAt(j);
                grid[i][j] = new Square(ch, i, j);
            }
        }
        
        for(int j = 0; j < 3; j++) {
            if(grid[0][j].getVal() == '.') {
                queue.add(grid[0][j]);
            }
        }
        
        // BFS!
        boolean win = false;
        while(!queue.isEmpty() && !win) {
            
            Square square = queue.remove();
            char val = square.getVal();
            int x = square.getX();
            int y = square.getY();
            
            if(x == rows - 1) {
                win = true;
            }else {

                // Down
                if(x + 1 < rows) {
                    Square next = grid[x + 1][y];
                    if(!next.visited) {
                        char nextVal = next.getVal();
                        // Okay to go down if it's rails or if train-to-train
                        if(nextVal == '.' || (nextVal == '*' && val == '*')) {
                            next.setVisited(true);
                            queue.add(next);
                            
                        // If ladder, go another square down
                        }else if(nextVal == '/') {
                            next = grid[x + 2][y];
                            next.setVisited(true);
                            queue.add(next);
                        }
                    }
                }
                // Left
                if(y - 1 >= 0) {
                    Square next = grid[x][y - 1];
                    if(!next.visited) {
                        char nextVal = next.getVal();
                        
                        // Okay if they match
                        if(nextVal == val) {
                            next.setVisited(true);
                            queue.add(next);
                        }
                    }
                }
                // Right
                if(y + 1 < cols) {
                    Square next = grid[x][y + 1];
                    if(!next.visited) {
                        char nextVal = next.getVal();
                        
                        // Okay if they match
                        if(nextVal == val) {
                            next.setVisited(true);
                            queue.add(next);
                        }
                    }
                }
            }
        }
        
        // Output
        if(win) {
            System.out.println("YES");            
        }else {
            System.out.println("NO");
        }
        
        br.close();
    }

}

class Square {
    
    char val;
    int x;
    int y;
    boolean visited = false;
    
    public Square(char val, int x, int y) {
        this.val = val;
        this.x = x;
        this.y = y;
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ") - " + val;
    }

}
