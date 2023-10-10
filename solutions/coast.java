import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class coast {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = br.readLine().split(" ");
        int rows = Integer.parseInt(nums[0]);
        int cols = Integer.parseInt(nums[1]);
        
        int[][] map = new int[rows + 2][cols + 2];
        
        // Filling the map
        for(int i = 0; i < rows; i++) {
            
            String line = br.readLine();
            for(int j = 0; j < cols; j++) {
                map[i + 1][j + 1] = Integer.parseInt(line.substring(j, j + 1)); 
            }
        }
        
        // BFS
        Queue<Coord> queue = new LinkedList<Coord>();
        
        Coord coord = new Coord(0, 0);
        queue.add(coord);
        
        int coast = 0;
        while(!queue.isEmpty()) {
            
            coord = queue.remove();
            int x = coord.x;
            int y = coord.y;
            
            if(map[x][y] == 0) {
                
                // Up
                if(x - 1 > 0) {
                    if(map[x - 1][y] == 0) {
                        queue.add(new Coord(x - 1, y));
                    }else if(map[x - 1][y] == 1) {
                        coast++;    
                    }
                }
                
                // Down
                if(x + 1 < rows + 2) {
                    if(map[x + 1][y] == 0) {
                        queue.add(new Coord(x + 1, y));
                    }else if(map[x + 1][y] == 1) {
                        coast++;                        
                    }
                }
                
                // Left
                if(y - 1 > 0) {
                    if(map[x][y - 1] == 0) {
                        queue.add(new Coord(x, y - 1));
                    }else if(map[x][y - 1] == 1) {
                        coast++;    
                    }
                }
                
                // Right
                if(y + 1 < cols + 2) {
                    if(map[x][y + 1] == 0) {
                        queue.add(new Coord(x, y + 1));
                    }else if(map[x][y  + 1] == 1) {
                        coast++;
                    }
                }
            }

            map[x][y] = 2;
        }

        System.out.println(coast);
        
    }

}

class Coord {
    
    int x = 0;
    int y = 0;
    
    public Coord(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Coord() {
        
    }
    
}

