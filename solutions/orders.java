import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class orders {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Input for the menuPrices
        int num = Integer.parseInt(br.readLine());
        int[] menuPrices = new int[num + 1];
        String[] line = br.readLine().split(" ");
        
        int max = -1;
        for(int i = 1; i <= num; i++) {
            menuPrices[i] = Integer.parseInt(line[i - 1]);
            if(menuPrices[i] > max) {
                max = menuPrices[i];
            }
        }
        
        // Input for the totalPrices
        num = Integer.parseInt(br.readLine());
        int[] totalPrices = new int[num + 1];
        line = br.readLine().split(" ");
        
        for(int i = 1; i <= num; i++) {
            totalPrices[i] = Integer.parseInt(line[i - 1]);
            if(totalPrices[i] > max) {
                max = totalPrices[i];
            }
        }
        
        int[][] priceTracker = new int[2][max + 1];
        
        // Filling the totals grid
        int[][] grid = new int[menuPrices.length][max + 1];
        for(int i = 1; i < grid.length; i++) {
            
            int menuPrice = menuPrices[i];
            priceTracker[0][menuPrice]++;
            priceTracker[1][menuPrice] = i;
            grid[i][menuPrice] = 1;
            
            for(int j = menuPrice + 1; j < grid[0].length; j++) {
                
                if(priceTracker[0][j - menuPrice] == 1) {                   
                    priceTracker[0][j]++;
                    priceTracker[1][j] = i;
                    grid[i][j] = 1;                 
                    
                }
                if(priceTracker[0][j - menuPrice] > 1) {
                    priceTracker[0][j] = priceTracker[0][j - menuPrice];
                    priceTracker[1][j] = i;
                }
            }
        }
        
        // Output
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < totalPrices.length; i++) {
            
            int totalPrice = totalPrices[i];
            int totalPriceCount = priceTracker[0][totalPrice];
            int totalPriceRow = priceTracker[1][totalPrice];
            
            if(totalPriceCount == 0) {
                sb.append("Impossible\n");
            }else if(totalPriceCount == 1) {
                
     //         LinkedList<Integer> list = new LinkedList<Integer>();
                int[] list = new int[totalPrice];
                int count = 0;
                
                while(totalPriceRow > 0) {
                    if(grid[totalPriceRow][totalPrice] == 0) {
                        totalPriceRow--;
                    }else {
                        int menuPrice = menuPrices[totalPriceRow];
                    //  list.add(totalPriceRow);
                        list[count++] = totalPriceRow;
                        totalPrice -= menuPrice;                        
                    }
                }
                
                for(int j = count - 1; j >= 0; j--) {
                    sb.append(list[j] + " ");
                }
                sb.append("\n");
                
            }else if(totalPriceCount > 1) {
                sb.append("Ambiguous\n");
            }
        }

        // Output
        System.out.println(sb);
        
        br.close();
    }

}
