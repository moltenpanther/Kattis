import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class asciikassi2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int width = num * 2 + 3;
        
        char[][] grid = new char[width][width];
        grid[0][num + 1] = 'x';
        grid[num + 1][0] = 'x';
        grid[num + 1][width - 1] = 'x';
        grid[width - 1][num + 1] = 'x';
        
        // Top left
        int col = num;
        for(int row = 1; row <= num; row++) {
            grid[row][col--] = '/';
        }
        
        // Top Right
        col = num + 2;
        for(int row = 1; row <= num; row++) {
            grid[row][col++] = '\\';
        }
        
        // Bottom left
        col = 1;
        for(int row = num + 2; row < width - 1; row++) {
            grid[row][col++] = '\\';
        }
        
        // Bottom right
        col = width - 2;
        for(int row = num + 2; row < width - 1; row++) {
            grid[row][col--] = '/';
        }
        
        // Building Output
        
        // Top/bottom row
        StringBuilder top = new StringBuilder();
        for(int j = 0 ; j < num + 1; j++) {
            top.append(" ");
        }
        top.append("x");
        
        StringBuilder sb = new StringBuilder();
        sb.append(top);
        sb.append("\n");
        
        for(int i = 1 ; i < width - 1; i++) {
            
            int count = 0;
            for(int j = 0 ; j < width; j++) {
                
                char ch = grid[i][j];
                if(ch == 0) {
                    sb.append(" ");
                }else {
                    sb.append(ch);
                    count++;
                }
                
                if(count == 2) {
                    j = width;
                }
                
            }
            sb.append("\n");
        }
        
        sb.append(top);
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
