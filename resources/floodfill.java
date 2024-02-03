import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class tenkindsofpeople {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        
        // Building Grid
        Node[][] grid = new Node[rows][cols];
        for(int i = 0; i < rows; i++) {
            String in = br.readLine();
            for(int j = 0; j < cols; j++) {
                int num = Integer.parseInt(in.substring(j, j + 1));
                grid[i][j] = new Node(num, i, j);
            }
        }
        
        int odds = 1;
        int evens = 2;
        int[][] flood = new int[rows][cols];
        
        int fill = 0;
        
        // Loop through BFS 
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                 
                if(flood[i][j] == 0) {
                    
                    // BFS
                    Queue<Node> queue = new LinkedList<Node>();
                    Node start = grid[i][j];
                    queue.add(start);
                    
                    int bin = start.val;
                    if(bin == 0) {
                        fill = evens;
                        evens += 2;
                    }else {
                        fill = odds;
                        odds += 2;
                    }
                    
                    flood[i][j] = fill;
                    
                    while(!queue.isEmpty()) {
                        
                        Node node = queue.remove();
                        int row = node.row;
                        int col = node.col;
                    
                        // Up
                        if(row  > 0) {
                            if(flood[row - 1][col] == 0 && grid[row - 1][col].val == bin) {
                                Node next = grid[row - 1][col];
                                queue.add(next);
                                flood[row - 1][col] = fill;
                            }
                        }
                        // Down
                        if(row < rows - 1) {
                            if(flood[row + 1][col] == 0 && grid[row + 1][col].val == bin) {
                                Node next = grid[row + 1][col];
                                queue.add(next);
                                flood[row + 1][col] = fill;
                            }
                        }
                        // Left
                        if(col > 0) {
                            if(flood[row][col - 1] == 0 && grid[row][col - 1].val == bin) {
                                Node next = grid[row][col - 1];
                                queue.add(next);
                                flood[row][col - 1] = fill;
                            }
                        }
                        // Right
                        if(col < cols - 1) {
                            if(flood[row][col + 1] == 0 && grid[row][col + 1].val == bin) {
                                Node next = grid[row][col + 1];
                                queue.add(next);
                                flood[row][col + 1] = fill;
                            }
                        }
                    }
                }
            }
        }
        
        // Checking the coordinates
        line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        
        for(int i = 0; i < num; i++) {
            
            // Input coordinates
            line = br.readLine().split(" ");
            int row1 = Integer.parseInt(line[0]) - 1;
            int col1 = Integer.parseInt(line[1]) - 1;
            int row2 = Integer.parseInt(line[2]) - 1;
            int col2 = Integer.parseInt(line[3]) - 1;
            
            int fill1 = flood[row1][col1];
            int fill2 = flood[row2][col2];
            boolean success = (fill1 == fill2);         
            
            // Output
            if(success) {
                if(fill1 % 2 == 0) {
                    System.out.println("binary");
                }else {
                    System.out.println("decimal");
                }
            }else {
                System.out.println("neither");              
            }
        }
        
        br.close();
    }

}

class Node {
    
    int val;
    int row;
    int col;
    
    public Node(int val, int row, int col) {
        this.val = val;
        this.row = row;
        this.col = col;
    }

    public int getVal() {
        return val;
    }
    
    public void setVal(int val) {
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

    @Override
    public String toString() {
        return "Node [val=" + val + ", row=" + row + ", col=" + col + "]";
    }

}
