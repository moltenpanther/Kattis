import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class pathtracing {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = 0;
        int y = 0;
        
        int xMin = 0;
        int xMax = 0;
        int yMin = 0;
        int yMax = 0;
        
        LinkedList<Integer> xs = new LinkedList<Integer>();
        LinkedList<Integer> ys = new LinkedList<Integer>();
        
        xs.add(0);
        ys.add(0);
        
        String line = "";
        while((line = br.readLine()) != null) {
            
            if(line.charAt(0) == 'd') {
                y++;
            }
            if(line.charAt(0) == 'u') {
                y--;
            }
            if(line.charAt(0) == 'l') {
                x--;
            }
            if(line.charAt(0) == 'r') {
                x++;
            }
            
            // Adding coord to list
            xs.add(x);
            ys.add(y);
            
            // Updating mins and maxes
            if(x > xMax) {
                xMax = x;
            }
            if(x < xMin) {
                xMin = x;
            }
            if(y > yMax) {
                yMax = y;
            }
            if(y < yMin) {
                yMin = y;
            }
            
        }

        int cols = Math.abs(xMin - xMax) + 1;
        int rows = Math.abs(yMin - yMax) + 1;

        char[][] map = new char[rows + 2][cols + 2];
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                if(i == 0 || j == 0 || i == map.length - 1 || j == map[0].length - 1) {
                    map[i][j] = '#';
                }else {
                    map[i][j] = ' ';
                }
            }
        }
        
    //  System.out.println(map[7][0]);
        
        
        // Filling Map
        for(int i = 1; i < ys.size() - 1; i++) {
            map[ys.get(i) - yMin + 1][xs.get(i) - xMin + 1] = '*';
        }
        
        map[ys.get(0) - yMin + 1][xs.get(0) - xMin + 1] = 'S';
        map[ys.get((ys.size() - 1)) - yMin + 1][xs.get((xs.size() - 1)) - xMin + 1] = 'E';
        
        // Output
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        
        br.close();
    }

}

