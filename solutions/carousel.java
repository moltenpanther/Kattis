import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class carousel {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int max = Integer.parseInt(line[1]);
        
        while(num + max != 0) {
            
            int bestCost = -1;
            int mostTickets = -1;
            double bestValue = -1;
            for(int i = 0; i < num; i++) {
                
                line = br.readLine().split(" ");
                int tickets = Integer.parseInt(line[0]);
                int cost = Integer.parseInt(line[1]);
                
                if(tickets <= max) {
                    double value = (double)tickets / (double)cost;
                    if(value > bestValue) {
                        bestValue = value;
                        mostTickets = tickets;
                        bestCost = cost;
                    }else if(value == bestValue) {
                        if(tickets > mostTickets) {
                            bestValue = value;
                            mostTickets = tickets;
                            bestCost = cost;
                        }
                    }
                }
            }
            
            // Formatting Output
            if(bestCost > -1) {
                sb.append("Buy ");
                sb.append(mostTickets);
                sb.append(" tickets for $");
                sb.append(bestCost);
                sb.append("\n");
            }else {
                sb.append("No suitable tickets offered\n");
            }
            
            line = br.readLine().split(" ");
            num = Integer.parseInt(line[0]);
            max = Integer.parseInt(line[1]);
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
