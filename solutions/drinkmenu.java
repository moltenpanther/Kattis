import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class drinkmenu {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        int numDrinks = Integer.parseInt(line[0]);
        int numCustomers = Integer.parseInt(line[1]);

        // Loop
        String[] drinks = new String[numDrinks];
        for(int i = 0; i < numDrinks; i++) {
            drinks[i] = br.readLine();
        }

        HashMap<String, Integer> custIndex = new HashMap<>();
        for(int i = 0; i < numCustomers; i++) {
            String customer = br.readLine();
            
            if(custIndex.containsKey(customer)) {
                sb.append(drinks[custIndex.get(customer)]).append("\n");
                custIndex.put(customer, (custIndex.get(customer) + 1));
            } else {
                sb.append(drinks[0]).append("\n");
                custIndex.put(customer, 1);
            }
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
