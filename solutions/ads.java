import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ads {
    
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
                char val = in.charAt(j);
                grid[i][j] = new Node(val, i, j);
            }
        }
        
        // Checking the grid
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                
                Node node = grid[i][j];
                char val = node.getVal();
                int row = node.getRow();
                int col = node.getCol();
                
                if(val == '+' && !node.isVisited()) {
                    grid = checkBorder(grid, row, col);
                }
            }
        }
        
        // Output
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sb.append(grid[i][j].getVal());
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
        
        br.close();
    }
    
    // Checks (recursively?) for bad ads
    public static Node[][] checkBorder(Node[][] grid, int startRow, int startCol) {
        
        // Find border
        int row = startRow;
        int col = startCol;
        
        int endRow = 0;
        int endCol = 0;
        
        // Going right
        boolean corner = false;
        while(col + 1 < grid[0].length && !corner) {
            
            if(grid[row][col + 1].getVal() == '+') {
                grid[row][++col].setVisited(true);
            }else {
                corner = true;
            }
        }
        
        endCol = col;
        
        // Going down
        corner = false;
        while(row + 1 < grid.length && !corner) {
            
            if(grid[row + 1][col].getVal() == '+') {
                grid[++row][col].setVisited(true);
            }else {
                corner = true;
            }
        }
        
        endRow = row;
        
        // Going left
        corner = false;
        while(col - 1 >= 0 && !corner) {
            
            if(grid[row][col - 1].getVal() == '+') {
                grid[row][--col].setVisited(true);
            }else {
                corner = true;
            }
        }
        
        // Going up
        corner = false;
        while(row - 1 >= 0 && !corner) {
            
            if(grid[row - 1][col].getVal() == '+') {
                grid[--row][col].setVisited(true);
            }else {
                corner = true;
            }
        }
        
        // Check ad contents
        grid = checkAd(grid, startRow + 1, startCol + 1, endRow - 1, endCol - 1);
        
        return grid;
    }
    
    static int[] ascii = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0};
    
    // Checks the content of the ad
    // Checks the interior of the ad for any bad characters
    public static Node[][] checkAd(Node[][] grid, int startRow, int startCol, int endRow, int endCol) {
        
        for(int i = startRow; i <= endRow; i++) {
            for(int j = startCol; j <= endCol; j++) {
                
                grid[i][j].setVisited(true);
                char val = grid[i][j].getVal();
                
                if(ascii[val] == 0) {
                    if(val == '+') {
                        checkBorder(grid, i, j);
                    }else {
                        grid = clearAd(grid, startRow, startCol, endRow, endCol);
                    }
                }
            }
        }
        
        return grid;
    }
    
    // Turns the ad to whitespace
    // Replaces ad with whitespace
    public static Node[][] clearAd(Node[][] grid, int startRow, int startCol, int endRow, int endCol) {
        
        for(int i = startRow - 1; i <= endRow + 1; i++) {
            for(int j = startCol - 1; j <= endCol + 1; j++) {
                grid[i][j].setVal(' ');
                grid[i][j].setVisited(true);
            }
        }
        
        return grid;
    }

}

class Node {
    
    char val;
    int row;
    int col;
    int dis;
    boolean visited = false;
    
    public Node(char val, int row, int col) {
        this.val = val;
        this.row = row;
        this.col = col;
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
