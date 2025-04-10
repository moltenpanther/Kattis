import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class grandpabernie {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        Map<String, List<Integer>> trips = new HashMap<>();

        // Loop through trips
        for (int i = 0; i < num; i++) {

            String[] line = br.readLine().split(" ");

            String country = line[0];
            int year = Integer.parseInt(line[1]);

            trips.putIfAbsent(country, new ArrayList<>());
            trips.get(country).add(year);
        }

        for (Map.Entry<String, List<Integer>> entry : trips.entrySet()) {
            List<Integer> years = entry.getValue();
            Collections.sort(years);
        }

        int queries = Integer.parseInt(br.readLine());
        for (int i = 0; i < queries; i++) {

            String[] line = br.readLine().split(" ");
            
            String country = line[0];
            int k = Integer.parseInt(line[1]);

            int year = trips.get(country).get(k - 1);
            sb.append(year).append("\n");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
