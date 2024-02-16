import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class refrigerator {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int costA = Integer.parseInt(line[0]);
        int capA = Integer.parseInt(line[1]);
        int costB = Integer.parseInt(line[2]);
        int capB = Integer.parseInt(line[3]);
        int fridges = Integer.parseInt(line[4]);
        
        int maxTripsA = fridges / capA + fridges % capA;

        int minCost = Integer.MAX_VALUE;
        int optA = -1;
        int optB = -1;
        for(int i = 0; i <= maxTripsA; i++) {
            
            int tripsA = i;
            
            int fridgesB = fridges - (tripsA * capA);
            int tripsB = fridgesB / capB;
            if(fridgesB % capB != 0) {
                tripsB++;
            }
            
            int icostA = tripsA * costA; 
            int icostB = tripsB * costB;
            
            int cost = icostA + icostB;
            if(cost < minCost) {
                minCost = cost;
                optA = tripsA;
                optB = tripsB;
            }
            
        }
        
        // Output
        System.out.println(optA + " " + optB + " " + minCost);
        
        br.close();
    }

}
