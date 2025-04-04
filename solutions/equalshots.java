import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class equalshots {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        int drinkA = Integer.parseInt(line[0]);
        int drinkB = Integer.parseInt(line[1]);

        // Loop
        float alcoholA = 0;
        for(int i = 0; i < drinkA; i++) {
            String[] drink = br.readLine().split(" ");
            int volume = Integer.parseInt(drink[0]);
            int percent = Integer.parseInt(drink[1]);
            alcoholA += (percent / 100.0) * volume;
        }

        float alcoholB = 0;
        for(int i = 0; i < drinkB; i++) {
            String[] drink = br.readLine().split(" ");
            int volume = Integer.parseInt(drink[0]);
            int percent = Integer.parseInt(drink[1]);
            alcoholB += (percent / 100.0) * volume;
        }

        // Output
        if(alcoholA == alcoholB) {
            sb.append("same");
        }else {
            sb.append("different");
        }
        
        System.out.println(sb);

        br.close();
    }

}
