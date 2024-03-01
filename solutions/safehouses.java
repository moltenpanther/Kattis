import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class safehouses {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading input
        String line = br.readLine();
        int num = Integer.parseInt(line);
        
        LinkedList<Square> spies = new LinkedList<Square>();
        LinkedList<Square> houses = new LinkedList<Square>();
        
        for(int i = 0; i < num; i++) {
            
            line = br.readLine();
            for(int j = 0; j < num; j++) {
                
                char ch = line.charAt(j);
                Square square = new Square(i, j);

                if(ch == 'H') {
                    houses.add(square);
                }else if(ch == 'S') {
                    spies.add(square);
                }
            }
        }
        
        // Checking them all
        int max = -1;
        for(Square spy : spies) {
            
            int spyX = spy.x;
            int spyY = spy.y;
            
            int min = Integer.MAX_VALUE;
            for(Square house : houses) {
                
                int houseX = house.x;
                int houseY = house.y;
                
                int dis = Math.abs(spyX - houseX) + Math.abs(spyY - houseY);
                if(dis < min) {
                    min = dis;
                }
            }
            
            if(min > max) {
                max = min;
            }
        }
        
        // Output
        System.out.println(max);
        
        br.close();
    }

}

class Square {
    
    int x;
    int y;
    
    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
