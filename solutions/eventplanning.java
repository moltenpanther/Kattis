import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eventplanning {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int budget = Integer.parseInt(line[1]);
        int hotels = Integer.parseInt(line[2]);
        int weeks = Integer.parseInt(line[3]);
        
        int minCost = Integer.MAX_VALUE;
        for(int i = 0; i < hotels; i++) {
            
            int price = Integer.parseInt(br.readLine());
            
            line = br.readLine().split(" ");
            for(int j = 0; j < weeks; j++) {
                
                int beds = Integer.parseInt(line[j]);
                if(beds >= num) {
                    int cost = num * price;
                    if(cost < minCost) {
                        minCost = cost;
                    }
                }
            }
        }
        
        // Output
        if(minCost <= budget) {
            System.out.println(minCost);            
        }else {
            System.out.println("stay home");
        }
        
        br.close();
    }

}
